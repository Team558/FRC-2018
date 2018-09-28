package org.usfirst.frc.team558.robot.center_paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleCenterLeftFrontArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (2.58,14.18,0.00)
	// (8.08,14.18,0.00)
	
    public doubleCenterLeftFrontArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleCenterLeftFrontArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.073,1.464,10.000,0.000},
				{0.366,4.392,10.000,0.000},
				{1.025,8.783,10.000,0.000},
				{2.196,14.639,10.000,0.000},
				{4.026,21.958,10.000,0.000},
				{6.661,30.741,10.000,0.000},
				{10.247,40.988,10.000,0.000},
				{14.931,52.699,10.000,0.000},
				{20.860,65.874,10.000,0.000},
				{28.180,80.513,10.000,0.000},
				{37.036,96.616,10.000,0.000},
				{47.576,114.182,10.000,0.000},
				{59.946,133.212,10.000,0.000},
				{74.292,153.707,10.000,0.000},
				{90.760,175.665,10.000,0.000},
				{109.498,199.087,10.000,0.000},
				{130.577,222.509,10.000,0.000},
				{153.999,245.931,10.000,0.000},
				{179.764,269.352,10.000,0.000},
				{207.870,292.774,10.000,0.000},
				{238.318,316.196,10.000,0.000},
				{271.109,339.618,10.000,0.000},
				{306.242,363.040,10.000,0.000},
				{343.717,386.462,10.000,0.000},
				{383.535,409.884,10.000,0.000},
				{425.694,433.306,10.000,0.000},
				{470.196,456.728,10.000,0.000},
				{517.040,480.150,10.000,0.000},
				{566.226,503.572,10.000,0.000},
				{617.754,526.994,10.000,0.000},
				{671.625,550.416,10.000,0.000},
				{727.837,573.838,10.000,0.000},
				{786.392,597.260,10.000,0.000},
				{847.289,620.682,10.000,0.000},
				{910.529,644.104,10.000,0.000},
				{976.110,667.526,10.000,0.000},
				{1044.034,690.948,10.000,0.000},
				{1114.300,714.370,10.000,0.000},
				{1186.908,737.792,10.000,0.000},
				{1261.858,761.214,10.000,0.000},
				{1339.150,784.636,10.000,0.000},
				{1418.785,808.057,10.000,0.000},
				{1500.762,831.479,10.000,0.000},
				{1585.081,854.901,10.000,0.000},
				{1671.742,878.323,10.000,0.000},
				{1760.746,901.745,10.000,0.000},
				{1852.091,925.167,10.000,0.000},
				{1945.779,948.589,10.000,0.000},
				{2041.809,972.011,10.000,0.000},
				{2140.181,995.433,10.000,0.000},
				{2240.896,1018.855,10.000,0.000},
				{2343.952,1042.277,10.000,0.000},
				{2449.351,1065.699,10.000,0.000},
				{2557.092,1089.121,10.000,0.000},
				{2667.175,1112.543,10.000,0.000},
				{2779.601,1135.965,10.000,0.000},
				{2894.368,1159.387,10.000,0.000},
				{3011.478,1182.809,10.000,0.000},
				{3130.930,1206.231,10.000,0.000},
				{3252.724,1229.653,10.000,0.000},
				{3376.860,1253.075,10.000,0.000},
				{3503.339,1276.497,10.000,0.000},
				{3632.160,1299.919,10.000,0.000},
				{3763.323,1323.340,10.000,0.000},
				{3896.828,1346.762,10.000,0.000},
				{4032.675,1370.184,10.000,0.000},
				{4170.865,1393.606,10.000,0.000},
				{4311.323,1415.564,10.000,0.000},
				{4453.904,1436.059,10.000,0.000},
				{4598.462,1455.089,10.000,0.000},
				{4744.849,1472.655,10.000,0.000},
				{4892.920,1488.758,10.000,0.000},
				{5042.527,1503.397,10.000,0.000},
				{5193.526,1516.572,10.000,0.000},
				{5345.769,1528.283,10.000,0.000},
				{5499.109,1538.530,10.000,0.000},
				{5653.401,1547.313,10.000,0.000},
				{5808.499,1554.632,10.000,0.000},
				{5964.255,1560.488,10.000,0.000},
				{6120.523,1564.879,10.000,0.000},
				{6277.157,1567.807,10.000,0.000},
				{6434.011,1569.271,10.000,0.000},
				{6590.884,1568.176,10.000,0.000},
				{6747.573,1565.618,10.000,0.000},
				{6903.934,1561.595,10.000,0.000},
				{7059.819,1556.109,10.000,0.000},
				{7215.083,1549.159,10.000,0.000},
				{7369.578,1540.744,10.000,0.000},
				{7523.158,1530.867,10.000,0.000},
				{7675.678,1519.525,10.000,0.000},
				{7826.990,1506.719,10.000,0.000},
				{7976.948,1492.449,10.000,0.000},
				{8125.407,1476.716,10.000,0.000},
				{8272.218,1459.519,10.000,0.000},
				{8417.237,1440.857,10.000,0.000},
				{8560.317,1420.732,10.000,0.000},
				{8701.310,1399.143,10.000,0.000},
				{8840.072,1376.090,10.000,0.000},
				{8976.510,1352.669,10.000,0.000},
				{9110.606,1329.247,10.000,0.000},
				{9242.359,1305.825,10.000,0.000},
				{9371.771,1282.403,10.000,0.000},
				{9498.840,1258.981,10.000,0.000},
				{9623.567,1235.559,10.000,0.000},
				{9745.952,1212.137,10.000,0.000},
				{9865.994,1188.715,10.000,0.000},
				{9983.695,1165.293,10.000,0.000},
				{10099.053,1141.871,10.000,0.000},
				{10212.069,1118.449,10.000,0.000},
				{10322.743,1095.027,10.000,0.000},
				{10431.074,1071.605,10.000,0.000},
				{10537.064,1048.183,10.000,0.000},
				{10640.711,1024.761,10.000,0.000},
				{10742.016,1001.339,10.000,0.000},
				{10840.979,977.917,10.000,0.000},
				{10937.599,954.495,10.000,0.000},
				{11031.878,931.073,10.000,0.000},
				{11123.814,907.651,10.000,0.000},
				{11213.408,884.229,10.000,0.000},
				{11300.660,860.807,10.000,0.000},
				{11385.569,837.386,10.000,0.000},
				{11468.137,813.964,10.000,0.000},
				{11548.362,790.542,10.000,0.000},
				{11626.245,767.120,10.000,0.000},
				{11701.786,743.698,10.000,0.000},
				{11774.985,720.276,10.000,0.000},
				{11845.841,696.854,10.000,0.000},
				{11914.356,673.432,10.000,0.000},
				{11980.528,650.010,10.000,0.000},
				{12044.358,626.588,10.000,0.000},
				{12105.845,603.166,10.000,0.000},
				{12164.991,579.744,10.000,0.000},
				{12221.794,556.322,10.000,0.000},
				{12276.255,532.900,10.000,0.000},
				{12328.374,509.478,10.000,0.000},
				{12378.151,486.056,10.000,0.000},
				{12425.585,462.634,10.000,0.000},
				{12470.678,439.212,10.000,0.000},
				{12513.428,415.790,10.000,0.000},
				{12553.836,392.368,10.000,0.000},
				{12591.901,368.946,10.000,0.000},
				{12627.625,345.524,10.000,0.000},
				{12661.006,322.102,10.000,0.000},
				{12692.045,298.681,10.000,0.000},
				{12720.742,275.259,10.000,0.000},
				{12747.097,251.837,10.000,0.000},
				{12771.110,228.415,10.000,0.000},
				{12792.780,204.993,10.000,0.000},
				{12812.108,181.571,10.000,0.000},
				{12829.149,159.244,10.000,0.000},
				{12844.030,138.380,10.000,0.000},
				{12856.898,118.981,10.000,0.000},
				{12867.900,101.045,10.000,0.000},
				{12877.180,84.573,10.000,0.000},
				{12884.887,69.566,10.000,0.000},
				{12891.167,56.022,10.000,0.000},
				{12896.165,43.941,10.000,0.000},
				{12900.028,33.325,10.000,0.000},
				{12902.903,24.173,10.000,0.000},
				{12904.936,16.484,10.000,0.000},
				{12906.273,10.260,10.000,0.000},
				{12907.061,5.499,10.000,0.000},
				{12907.446,2.202,10.000,0.000},
				{12907.575,0.369,10.000,0.000},
				{12907.593,0.000,10.000,0.000},
				{12907.593,0.000,10.000,0.000}		};

}