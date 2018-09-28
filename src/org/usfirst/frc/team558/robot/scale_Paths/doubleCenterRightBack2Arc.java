package org.usfirst.frc.team558.robot.scale_Paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleCenterRightBack2Arc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (7.58,13.18,0.00)
	// (3.08,13.18,0.00)
	
    public doubleCenterRightBack2Arc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleCenterRightBack2Arc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{-0.073,-1.463,10.000,0.000},
				{-0.366,-4.388,10.000,0.000},
				{-1.024,-8.776,10.000,0.000},
				{-2.194,-14.626,10.000,0.000},
				{-4.022,-21.939,10.000,0.000},
				{-6.655,-30.715,10.000,0.000},
				{-10.238,-40.953,10.000,0.000},
				{-14.919,-52.654,10.000,0.000},
				{-20.842,-65.817,10.000,0.000},
				{-28.155,-80.443,10.000,0.000},
				{-37.004,-96.532,10.000,0.000},
				{-47.534,-114.083,10.000,0.000},
				{-59.893,-133.097,10.000,0.000},
				{-74.227,-153.573,10.000,0.000},
				{-90.681,-175.512,10.000,0.000},
				{-109.402,-198.914,10.000,0.000},
				{-130.464,-222.315,10.000,0.000},
				{-153.865,-245.717,10.000,0.000},
				{-179.607,-269.118,10.000,0.000},
				{-207.689,-292.520,10.000,0.000},
				{-238.111,-315.922,10.000,0.000},
				{-270.873,-339.323,10.000,0.000},
				{-305.976,-362.725,10.000,0.000},
				{-343.418,-386.126,10.000,0.000},
				{-383.201,-409.528,10.000,0.000},
				{-425.324,-432.930,10.000,0.000},
				{-469.787,-456.331,10.000,0.000},
				{-516.590,-479.733,10.000,0.000},
				{-565.734,-503.134,10.000,0.000},
				{-617.217,-526.536,10.000,0.000},
				{-671.041,-549.937,10.000,0.000},
				{-727.205,-573.339,10.000,0.000},
				{-785.709,-596.741,10.000,0.000},
				{-846.553,-620.142,10.000,0.000},
				{-909.737,-643.544,10.000,0.000},
				{-975.262,-666.945,10.000,0.000},
				{-1043.126,-690.347,10.000,0.000},
				{-1113.331,-713.749,10.000,0.000},
				{-1185.876,-737.150,10.000,0.000},
				{-1260.761,-760.552,10.000,0.000},
				{-1337.986,-783.953,10.000,0.000},
				{-1417.552,-807.355,10.000,0.000},
				{-1499.457,-830.757,10.000,0.000},
				{-1583.703,-854.158,10.000,0.000},
				{-1670.289,-877.560,10.000,0.000},
				{-1759.215,-900.961,10.000,0.000},
				{-1850.481,-924.363,10.000,0.000},
				{-1944.088,-947.765,10.000,0.000},
				{-2040.034,-971.166,10.000,0.000},
				{-2138.321,-994.568,10.000,0.000},
				{-2238.948,-1017.969,10.000,0.000},
				{-2341.915,-1041.371,10.000,0.000},
				{-2447.222,-1064.773,10.000,0.000},
				{-2554.869,-1088.174,10.000,0.000},
				{-2664.857,-1111.576,10.000,0.000},
				{-2777.184,-1134.977,10.000,0.000},
				{-2891.852,-1158.379,10.000,0.000},
				{-3008.860,-1181.781,10.000,0.000},
				{-3128.208,-1205.182,10.000,0.000},
				{-3249.897,-1228.584,10.000,0.000},
				{-3373.852,-1250.523,10.000,0.000},
				{-3499.928,-1270.999,10.000,0.000},
				{-3627.979,-1290.013,10.000,0.000},
				{-3757.857,-1307.564,10.000,0.000},
				{-3889.418,-1323.653,10.000,0.000},
				{-4022.515,-1338.279,10.000,0.000},
				{-4157.001,-1351.442,10.000,0.000},
				{-4292.730,-1363.143,10.000,0.000},
				{-4429.556,-1373.381,10.000,0.000},
				{-4567.333,-1382.157,10.000,0.000},
				{-4705.915,-1389.470,10.000,0.000},
				{-4845.154,-1395.320,10.000,0.000},
				{-4984.906,-1399.708,10.000,0.000},
				{-5125.023,-1402.633,10.000,0.000},
				{-5265.359,-1404.096,10.000,0.000},
				{-5405.711,-1402.946,10.000,0.000},
				{-5545.875,-1400.334,10.000,0.000},
				{-5685.705,-1396.259,10.000,0.000},
				{-5825.054,-1390.721,10.000,0.000},
				{-5963.776,-1383.721,10.000,0.000},
				{-6101.725,-1375.259,10.000,0.000},
				{-6238.754,-1365.333,10.000,0.000},
				{-6374.718,-1353.945,10.000,0.000},
				{-6509.470,-1341.095,10.000,0.000},
				{-6642.864,-1326.782,10.000,0.000},
				{-6774.754,-1311.006,10.000,0.000},
				{-6904.992,-1293.768,10.000,0.000},
				{-7033.434,-1275.067,10.000,0.000},
				{-7159.933,-1254.904,10.000,0.000},
				{-7284.342,-1233.278,10.000,0.000},
				{-7406.515,-1210.189,10.000,0.000},
				{-7526.364,-1186.787,10.000,0.000},
				{-7643.873,-1163.386,10.000,0.000},
				{-7759.041,-1139.984,10.000,0.000},
				{-7871.869,-1116.582,10.000,0.000},
				{-7982.358,-1093.181,10.000,0.000},
				{-8090.506,-1069.779,10.000,0.000},
				{-8196.313,-1046.378,10.000,0.000},
				{-8299.781,-1022.976,10.000,0.000},
				{-8400.909,-999.574,10.000,0.000},
				{-8499.696,-976.173,10.000,0.000},
				{-8596.143,-952.771,10.000,0.000},
				{-8690.250,-929.370,10.000,0.000},
				{-8782.017,-905.968,10.000,0.000},
				{-8871.444,-882.567,10.000,0.000},
				{-8958.530,-859.165,10.000,0.000},
				{-9043.277,-835.763,10.000,0.000},
				{-9125.683,-812.362,10.000,0.000},
				{-9205.749,-788.960,10.000,0.000},
				{-9283.475,-765.559,10.000,0.000},
				{-9358.861,-742.157,10.000,0.000},
				{-9431.906,-718.755,10.000,0.000},
				{-9502.612,-695.354,10.000,0.000},
				{-9570.977,-671.952,10.000,0.000},
				{-9637.002,-648.551,10.000,0.000},
				{-9700.687,-625.149,10.000,0.000},
				{-9762.032,-601.747,10.000,0.000},
				{-9821.037,-578.346,10.000,0.000},
				{-9877.701,-554.944,10.000,0.000},
				{-9932.026,-531.543,10.000,0.000},
				{-9984.010,-508.141,10.000,0.000},
				{-10033.654,-484.739,10.000,0.000},
				{-10080.958,-461.338,10.000,0.000},
				{-10125.921,-437.936,10.000,0.000},
				{-10168.545,-414.535,10.000,0.000},
				{-10208.828,-391.133,10.000,0.000},
				{-10246.772,-367.731,10.000,0.000},
				{-10282.375,-344.330,10.000,0.000},
				{-10315.638,-320.928,10.000,0.000},
				{-10346.560,-297.527,10.000,0.000},
				{-10375.143,-274.125,10.000,0.000},
				{-10401.385,-250.723,10.000,0.000},
				{-10425.288,-227.322,10.000,0.000},
				{-10446.850,-203.920,10.000,0.000},
				{-10466.072,-180.519,10.000,0.000},
				{-10483.011,-158.267,10.000,0.000},
				{-10497.798,-137.477,10.000,0.000},
				{-10510.579,-118.151,10.000,0.000},
				{-10521.501,-100.287,10.000,0.000},
				{-10530.710,-83.885,10.000,0.000},
				{-10538.351,-68.946,10.000,0.000},
				{-10544.572,-55.470,10.000,0.000},
				{-10549.519,-43.456,10.000,0.000},
				{-10553.337,-32.905,10.000,0.000},
				{-10556.173,-23.816,10.000,0.000},
				{-10558.173,-16.191,10.000,0.000},
				{-10559.484,-10.027,10.000,0.000},
				{-10560.252,-5.327,10.000,0.000},
				{-10560.622,-2.088,10.000,0.000},
				{-10560.742,-0.313,10.000,0.000},
				{-10560.758,-0.000,10.000,0.000},
				{-10560.758,-0.000,10.000,0.000}		};

}