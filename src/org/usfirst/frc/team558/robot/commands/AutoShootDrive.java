package org.usfirst.frc.team558.robot.commands;

import org.usfirst.frc.team558.robot.Robot;
import org.usfirst.frc.team558.robot.RobotMap;
import org.usfirst.frc.team558.robot.util.Util;

import edu.wpi.first.wpilibj.command.Command;


public class AutoShootDrive extends Command {
	 private double oldWheel = 0.0;
	 private double quickStopAccumulator;
	 private double wheelDeadband = 0.07;

    public AutoShootDrive() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveTrain);
        requires(Robot.Arm);
        requires(Robot.punch);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	//boolean isQuickTurn = Robot.m_oi.GetQuickTurn();

    	Robot.Arm.motionMagic(0);
    	
        double wheelNonLinearity;

        double wheel = handleDeadband(Robot.m_oi.GetTurn(), wheelDeadband);
        double throttle = -.5;

        double negInertia = wheel - oldWheel;
        oldWheel = wheel;

        wheelNonLinearity = 0.5;
        // Apply a sin function that's scaled to make it feel better.
        wheel = Math.sin(Math.PI / 2.0 * wheelNonLinearity * wheel) /
            Math.sin(Math.PI / 2.0 * wheelNonLinearity);
        wheel = Math.sin(Math.PI / 2.0 * wheelNonLinearity * wheel) /
            Math.sin(Math.PI / 2.0 * wheelNonLinearity);
        wheel = Math.sin(Math.PI / 2.0 * wheelNonLinearity * wheel) /
            Math.sin(Math.PI / 2.0 * wheelNonLinearity);
        

        double leftPwm, rightPwm, overPower;
        double sensitivity = RobotMap.normalTurnSensitivity;

        double angularPower;
        double linearPower;

        // Negative inertia!
        double negInertiaAccumulator = 0.0;
        double negInertiaScalar;
          if (wheel * negInertia > 0) {
            negInertiaScalar = 2.5;
          } 
          else {
            if (Math.abs(wheel) > 0.65) {
              negInertiaScalar = 5.0;
            } 
            else {
              negInertiaScalar = 3.0;
            }
          }
          sensitivity = RobotMap.normalTurnSensitivity;

          if (Math.abs(throttle) > 0.1) {
          }
        
        double negInertiaPower = negInertia * negInertiaScalar;
        negInertiaAccumulator += negInertiaPower;

        wheel = wheel + negInertiaAccumulator;
        if (negInertiaAccumulator > 1) {
          negInertiaAccumulator -= 1;
        }
        else if (negInertiaAccumulator < -1) {
          negInertiaAccumulator += 1;
        } 
        else {
          negInertiaAccumulator = 0;
        }
        linearPower = throttle;

        // Quickturn!
        //if (isQuickTurn) {
          if (Math.abs(linearPower) < 0.2) {
            double alpha = 0.1;
            quickStopAccumulator = (1 - alpha) * quickStopAccumulator + alpha *
                Util.limit(wheel, 1.0) * 5;
          //}
          overPower = 1.0;
          sensitivity = 1.0;
          
          angularPower = RobotMap.quickturnSensitivity * wheel;
        } 
        else {
          overPower = 0.0;
          angularPower = Math.abs(throttle) * wheel * sensitivity - quickStopAccumulator;
          if (quickStopAccumulator > 1) {
            quickStopAccumulator -= 1;
          } else if (quickStopAccumulator < -1) {
            quickStopAccumulator += 1;
          } else {
            quickStopAccumulator = 0.0;
          }
        }

        rightPwm = leftPwm = linearPower;
        leftPwm += angularPower;
        rightPwm -= angularPower;

        if (leftPwm > 1.0) {
          rightPwm -= overPower * (leftPwm - 1.0);
          leftPwm = 1.0;
        } else if (rightPwm > 1.0) {
          leftPwm -= overPower * (rightPwm - 1.0);
          rightPwm = 1.0;
        } else if (leftPwm < -1.0) {
          rightPwm += overPower * (-1.0 - leftPwm);
          leftPwm = -1.0;
        } else if (rightPwm < -1.0) {
          leftPwm += overPower * (-1.0 - rightPwm);
          rightPwm = -1.0;
        }

        Robot.driveTrain.drive(leftPwm, rightPwm);
        
        
        if(Robot.lineSensor.readSensors()){
        	Robot.punch.pushCube();
        	Robot.rollerClaw.setMotors(-1);
        	
        }
        
        
        
    }
    	
    public double handleDeadband(double val, double deadband) {
        return (Math.abs(val) > Math.abs(deadband)) ? val : 0.0;
      }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.driveTrain.initDefaultCommand();
    	Robot.punch.resetPunch();
    	Robot.rollerClaw.initDefaultCommand();
    	Robot.Arm.goToZero();
    }
}
