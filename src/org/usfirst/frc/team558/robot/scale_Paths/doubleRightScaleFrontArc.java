package org.usfirst.frc.team558.robot.scale_Paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleRightScaleFrontArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (28.39,7.81,0.00)
	// (22.19,7.01,-8.00)
	
    public doubleRightScaleFrontArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleRightScaleFrontArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{0.072,1.449,10.000,0.000},
				{0.362,4.348,10.000,0.000},
				{1.015,8.696,10.000,0.000},
				{2.174,14.494,10.000,0.000},
				{3.986,21.741,10.000,0.000},
				{6.595,30.438,10.000,0.000},
				{10.146,40.584,10.000,0.000},
				{14.784,52.179,10.000,0.000},
				{20.654,65.224,10.000,0.001},
				{27.901,79.718,10.000,0.001},
				{36.670,95.661,10.000,0.002},
				{47.106,113.054,10.000,0.003},
				{59.353,131.897,10.000,0.005},
				{73.558,152.188,10.000,0.008},
				{89.864,173.930,10.000,0.012},
				{108.416,197.120,10.000,0.017},
				{129.288,220.311,10.000,0.024},
				{152.478,243.501,10.000,0.033},
				{177.988,266.692,10.000,0.045},
				{205.817,289.883,10.000,0.060},
				{235.964,313.073,10.000,0.078},
				{268.431,336.264,10.000,0.100},
				{303.217,359.454,10.000,0.127},
				{340.322,382.645,10.000,0.160},
				{379.746,405.836,10.000,0.198},
				{421.489,429.026,10.000,0.242},
				{465.552,452.217,10.000,0.293},
				{511.933,475.408,10.000,0.352},
				{560.633,498.598,10.000,0.420},
				{611.652,521.789,10.000,0.496},
				{664.991,544.979,10.000,0.582},
				{720.648,568.170,10.000,0.678},
				{778.625,591.361,10.000,0.785},
				{838.920,614.551,10.000,0.903},
				{901.535,637.742,10.000,1.034},
				{966.469,660.932,10.000,1.177},
				{1033.722,684.123,10.000,1.333},
				{1103.293,707.314,10.000,1.503},
				{1175.184,730.504,10.000,1.687},
				{1249.394,753.695,10.000,1.886},
				{1325.923,776.886,10.000,2.100},
				{1404.771,800.076,10.000,2.330},
				{1485.938,823.267,10.000,2.575},
				{1569.425,846.457,10.000,2.837},
				{1655.230,869.648,10.000,3.114},
				{1743.354,892.839,10.000,3.408},
				{1833.798,916.029,10.000,3.718},
				{1926.560,939.220,10.000,4.045},
				{2021.642,962.410,10.000,4.387},
				{2119.042,985.601,10.000,4.746},
				{2218.762,1008.792,10.000,5.120},
				{2320.801,1031.982,10.000,5.508},
				{2425.158,1055.173,10.000,5.912},
				{2531.835,1078.363,10.000,6.329},
				{2640.831,1101.554,10.000,6.759},
				{2752.146,1124.745,10.000,7.201},
				{2865.780,1147.935,10.000,7.654},
				{2981.733,1171.126,10.000,8.117},
				{3100.005,1194.317,10.000,8.589},
				{3220.596,1217.507,10.000,9.067},
				{3343.507,1240.698,10.000,9.552},
				{3468.736,1263.888,10.000,10.040},
				{3596.284,1287.079,10.000,10.531},
				{3726.152,1310.270,10.000,11.022},
				{3858.338,1333.460,10.000,11.512},
				{3992.844,1356.651,10.000,11.998},
				{4129.668,1379.841,10.000,12.479},
				{4268.812,1403.032,10.000,12.952},
				{4410.275,1426.223,10.000,13.415},
				{4554.057,1449.413,10.000,13.865},
				{4700.157,1472.604,10.000,14.302},
				{4848.577,1495.795,10.000,14.721},
				{4999.316,1518.985,10.000,15.122},
				{5152.302,1540.726,10.000,15.500},
				{5307.389,1561.018,10.000,15.854},
				{5464.433,1579.860,10.000,16.182},
				{5623.289,1597.253,10.000,16.480},
				{5783.811,1613.197,10.000,16.746},
				{5945.856,1627.691,10.000,16.979},
				{6109.277,1640.736,10.000,17.177},
				{6273.930,1652.331,10.000,17.337},
				{6439.671,1662.477,10.000,17.458},
				{6606.353,1671.174,10.000,17.540},
				{6773.833,1678.421,10.000,17.580},
				{6941.965,1684.218,10.000,17.578},
				{7110.604,1688.566,10.000,17.533},
				{7279.606,1691.465,10.000,17.445},
				{7448.790,1692.220,10.000,17.313},
				{7617.905,1690.076,10.000,17.138},
				{7786.733,1686.482,10.000,16.920},
				{7955.129,1681.439,10.000,16.659},
				{8122.948,1674.947,10.000,16.356},
				{8290.046,1667.005,10.000,16.013},
				{8456.277,1657.614,10.000,15.631},
				{8621.496,1646.773,10.000,15.211},
				{8785.559,1634.483,10.000,14.755},
				{8948.320,1620.744,10.000,14.266},
				{9109.635,1605.555,10.000,13.744},
				{9269.359,1588.917,10.000,13.194},
				{9427.346,1570.829,10.000,12.618},
				{9583.452,1551.292,10.000,12.018},
				{9737.532,1530.306,10.000,11.399},
				{9889.441,1507.870,10.000,10.762},
				{10039.068,1484.679,10.000,10.112},
				{10186.377,1461.488,10.000,9.450},
				{10331.366,1438.298,10.000,8.781},
				{10474.036,1415.107,10.000,8.107},
				{10614.387,1391.917,10.000,7.430},
				{10752.419,1368.726,10.000,6.753},
				{10888.132,1345.535,10.000,6.078},
				{11021.526,1322.345,10.000,5.407},
				{11152.601,1299.154,10.000,4.744},
				{11281.357,1275.963,10.000,4.089},
				{11407.794,1252.773,10.000,3.445},
				{11531.912,1229.582,10.000,2.814},
				{11653.711,1206.392,10.000,2.196},
				{11773.190,1183.201,10.000,1.594},
				{11890.351,1160.010,10.000,1.009},
				{12005.192,1136.820,10.000,0.442},
				{12117.715,1113.629,10.000,-0.107},
				{12227.918,1090.439,10.000,-0.636},
				{12335.802,1067.248,10.000,-1.145},
				{12441.368,1044.057,10.000,-1.634},
				{12544.614,1020.867,10.000,-2.101},
				{12645.541,997.676,10.000,-2.548},
				{12744.149,974.486,10.000,-2.973},
				{12840.438,951.295,10.000,-3.376},
				{12934.408,928.104,10.000,-3.759},
				{13026.059,904.914,10.000,-4.121},
				{13115.391,881.723,10.000,-4.461},
				{13202.404,858.532,10.000,-4.782},
				{13287.097,835.342,10.000,-5.082},
				{13369.472,812.151,10.000,-5.363},
				{13449.528,788.961,10.000,-5.625},
				{13527.264,765.770,10.000,-5.869},
				{13602.682,742.579,10.000,-6.094},
				{13675.780,719.389,10.000,-6.303},
				{13746.559,696.198,10.000,-6.494},
				{13815.020,673.008,10.000,-6.671},
				{13881.161,649.817,10.000,-6.831},
				{13944.983,626.626,10.000,-6.978},
				{14006.486,603.436,10.000,-7.111},
				{14065.670,580.245,10.000,-7.231},
				{14122.535,557.054,10.000,-7.338},
				{14177.081,533.864,10.000,-7.435},
				{14229.308,510.673,10.000,-7.520},
				{14279.216,487.483,10.000,-7.596},
				{14326.804,464.292,10.000,-7.663},
				{14372.074,441.101,10.000,-7.721},
				{14415.025,417.911,10.000,-7.771},
				{14455.656,394.720,10.000,-7.814},
				{14493.969,371.530,10.000,-7.851},
				{14529.962,348.339,10.000,-7.882},
				{14563.637,325.148,10.000,-7.907},
				{14594.992,301.958,10.000,-7.929},
				{14624.028,278.767,10.000,-7.946},
				{14650.745,255.577,10.000,-7.960},
				{14675.143,232.386,10.000,-7.971},
				{14697.223,209.195,10.000,-7.979},
				{14716.983,186.005,10.000,-7.985},
				{14734.458,163.509,10.000,-7.990},
				{14749.757,142.462,10.000,-7.993},
				{14763.023,122.865,10.000,-7.996},
				{14774.402,104.718,10.000,-7.997},
				{14784.039,88.019,10.000,-7.998},
				{14792.079,72.771,10.000,-7.999},
				{14798.666,58.971,10.000,-8.000},
				{14803.945,46.621,10.000,-8.000},
				{14808.062,35.721,10.000,-8.000},
				{14811.162,26.269,10.000,-8.000},
				{14813.389,18.268,10.000,-8.000},
				{14814.888,11.715,10.000,-8.000},
				{14815.804,6.612,10.000,-8.000},
				{14816.283,2.959,10.000,-8.000},
				{14816.468,0.755,10.000,-8.000},
				{14816.506,0.000,10.000,-8.000},
				{14816.506,0.000,10.000,-8.000}		};

}