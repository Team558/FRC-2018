package org.usfirst.frc.team558.robot.paths;

import org.usfirst.frc.team558.robot.util.*;

public class CrossTheLineArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.31,13.08,0.00)
	// (11.31,13.08,0.00)
	
    public CrossTheLineArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CrossTheLineArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{-0.057,-1.141,10.000,0.000},
				{-0.285,-3.422,10.000,0.000},
				{-0.799,-6.845,10.000,0.000},
				{-1.711,-11.408,10.000,0.000},
				{-3.137,-17.112,10.000,0.000},
				{-5.191,-23.957,10.000,0.000},
				{-7.986,-31.942,10.000,0.000},
				{-11.636,-41.069,10.000,0.000},
				{-16.256,-51.336,10.000,0.000},
				{-21.960,-62.744,10.000,0.000},
				{-28.862,-75.293,10.000,0.000},
				{-37.076,-88.982,10.000,0.000},
				{-46.716,-103.813,10.000,0.000},
				{-57.896,-119.784,10.000,0.000},
				{-70.730,-136.896,10.000,0.000},
				{-85.332,-155.149,10.000,0.000},
				{-101.759,-173.402,10.000,0.000},
				{-120.012,-191.655,10.000,0.000},
				{-140.090,-209.907,10.000,0.000},
				{-161.994,-228.160,10.000,0.000},
				{-185.722,-246.413,10.000,0.000},
				{-211.276,-264.666,10.000,0.000},
				{-238.656,-282.919,10.000,0.000},
				{-267.860,-301.171,10.000,0.000},
				{-298.890,-319.424,10.000,0.000},
				{-331.745,-337.677,10.000,0.000},
				{-366.425,-355.930,10.000,0.000},
				{-402.931,-374.183,10.000,0.000},
				{-441.262,-392.436,10.000,0.000},
				{-481.418,-410.688,10.000,0.000},
				{-523.400,-428.941,10.000,0.000},
				{-567.206,-447.194,10.000,0.000},
				{-612.838,-465.447,10.000,0.000},
				{-660.296,-483.700,10.000,0.000},
				{-709.578,-501.952,10.000,0.000},
				{-760.686,-520.205,10.000,0.000},
				{-813.619,-538.458,10.000,0.000},
				{-868.378,-556.711,10.000,0.000},
				{-924.961,-574.964,10.000,0.000},
				{-983.370,-593.217,10.000,0.000},
				{-1043.605,-611.469,10.000,0.000},
				{-1105.664,-629.722,10.000,0.000},
				{-1169.549,-647.975,10.000,0.000},
				{-1235.259,-666.228,10.000,0.000},
				{-1302.795,-684.481,10.000,0.000},
				{-1372.155,-702.733,10.000,0.000},
				{-1443.341,-720.986,10.000,0.000},
				{-1516.353,-739.239,10.000,0.000},
				{-1591.189,-757.492,10.000,0.000},
				{-1667.851,-775.745,10.000,0.000},
				{-1746.338,-793.998,10.000,0.000},
				{-1826.651,-812.250,10.000,0.000},
				{-1908.788,-830.503,10.000,0.000},
				{-1992.751,-848.756,10.000,0.000},
				{-2078.539,-867.009,10.000,0.000},
				{-2166.153,-885.262,10.000,0.000},
				{-2255.592,-903.514,10.000,0.000},
				{-2346.856,-921.767,10.000,0.000},
				{-2439.945,-940.020,10.000,0.000},
				{-2534.860,-958.273,10.000,0.000},
				{-2631.600,-976.526,10.000,0.000},
				{-2730.165,-994.779,10.000,0.000},
				{-2830.556,-1013.031,10.000,0.000},
				{-2932.771,-1031.284,10.000,0.000},
				{-3036.812,-1049.537,10.000,0.000},
				{-3142.679,-1067.790,10.000,0.000},
				{-3250.370,-1086.043,10.000,0.000},
				{-3359.887,-1104.295,10.000,0.000},
				{-3471.229,-1122.548,10.000,0.000},
				{-3584.397,-1140.801,10.000,0.000},
				{-3699.390,-1159.054,10.000,0.000},
				{-3816.208,-1177.307,10.000,0.000},
				{-3934.851,-1195.559,10.000,0.000},
				{-4055.320,-1213.812,10.000,0.000},
				{-4177.613,-1232.065,10.000,0.000},
				{-4301.733,-1250.318,10.000,0.000},
				{-4427.677,-1268.571,10.000,0.000},
				{-4555.447,-1286.824,10.000,0.000},
				{-4685.042,-1305.076,10.000,0.000},
				{-4816.462,-1323.329,10.000,0.000},
				{-4949.708,-1341.582,10.000,0.000},
				{-5084.778,-1359.835,10.000,0.000},
				{-5221.674,-1378.088,10.000,0.000},
				{-5360.396,-1396.340,10.000,0.000},
				{-5500.943,-1414.593,10.000,0.000},
				{-5643.315,-1432.846,10.000,0.000},
				{-5787.512,-1451.099,10.000,0.000},
				{-5933.534,-1469.352,10.000,0.000},
				{-6081.382,-1487.605,10.000,0.000},
				{-6231.055,-1505.857,10.000,0.000},
				{-6382.554,-1524.110,10.000,0.000},
				{-6535.877,-1542.363,10.000,0.000},
				{-6691.026,-1560.616,10.000,0.000},
				{-6848.000,-1578.869,10.000,0.000},
				{-7006.800,-1597.121,10.000,0.000},
				{-7167.425,-1615.374,10.000,0.000},
				{-7329.875,-1633.627,10.000,0.000},
				{-7494.150,-1651.880,10.000,0.000},
				{-7660.251,-1670.133,10.000,0.000},
				{-7828.177,-1688.386,10.000,0.000},
				{-7997.928,-1706.638,10.000,0.000},
				{-8169.504,-1724.891,10.000,0.000},
				{-8342.906,-1743.144,10.000,0.000},
				{-8518.133,-1761.397,10.000,0.000},
				{-8695.185,-1779.650,10.000,0.000},
				{-8874.063,-1797.902,10.000,0.000},
				{-9054.766,-1816.155,10.000,0.000},
				{-9237.294,-1834.408,10.000,0.000},
				{-9421.648,-1852.661,10.000,0.000},
				{-9607.826,-1870.914,10.000,0.000},
				{-9795.830,-1889.167,10.000,0.000},
				{-9985.660,-1907.419,10.000,0.000},
				{-10177.257,-1924.531,10.000,0.000},
				{-10370.509,-1940.503,10.000,0.000},
				{-10565.301,-1955.333,10.000,0.000},
				{-10761.518,-1969.023,10.000,0.000},
				{-10959.048,-1981.571,10.000,0.000},
				{-11157.776,-1992.979,10.000,0.000},
				{-11357.587,-2003.247,10.000,0.000},
				{-11558.368,-2012.373,10.000,0.000},
				{-11760.005,-2020.359,10.000,0.000},
				{-11962.383,-2027.203,10.000,0.000},
				{-12165.388,-2032.907,10.000,0.000},
				{-12368.907,-2037.471,10.000,0.000},
				{-12572.825,-2040.893,10.000,0.000},
				{-12777.029,-2043.175,10.000,0.000},
				{-12981.403,-2044.315,10.000,0.000},
				{-13185.809,-2043.806,10.000,0.000},
				{-13390.107,-2042.156,10.000,0.000},
				{-13594.183,-2039.365,10.000,0.000},
				{-13797.923,-2035.433,10.000,0.000},
				{-14001.213,-2030.360,10.000,0.000},
				{-14203.938,-2024.147,10.000,0.000},
				{-14405.985,-2016.793,10.000,0.000},
				{-14607.240,-2008.297,10.000,0.000},
				{-14807.588,-1998.662,10.000,0.000},
				{-15006.915,-1987.885,10.000,0.000},
				{-15205.108,-1975.968,10.000,0.000},
				{-15402.051,-1962.909,10.000,0.000},
				{-15597.632,-1948.710,10.000,0.000},
				{-15791.736,-1933.370,10.000,0.000},
				{-15984.249,-1916.890,10.000,0.000},
				{-16175.057,-1899.268,10.000,0.000},
				{-16364.072,-1881.015,10.000,0.000},
				{-16551.260,-1862.763,10.000,0.000},
				{-16736.624,-1844.510,10.000,0.000},
				{-16920.162,-1826.257,10.000,0.000},
				{-17101.875,-1808.004,10.000,0.000},
				{-17281.763,-1789.751,10.000,0.000},
				{-17459.826,-1771.499,10.000,0.000},
				{-17636.063,-1753.246,10.000,0.000},
				{-17810.475,-1734.993,10.000,0.000},
				{-17983.062,-1716.740,10.000,0.000},
				{-18153.823,-1698.487,10.000,0.000},
				{-18322.759,-1680.234,10.000,0.000},
				{-18489.870,-1661.982,10.000,0.000},
				{-18655.155,-1643.729,10.000,0.000},
				{-18818.616,-1625.476,10.000,0.000},
				{-18980.251,-1607.223,10.000,0.000},
				{-19140.060,-1588.970,10.000,0.000},
				{-19298.045,-1570.718,10.000,0.000},
				{-19454.204,-1552.465,10.000,0.000},
				{-19608.538,-1534.212,10.000,0.000},
				{-19761.046,-1515.959,10.000,0.000},
				{-19911.729,-1497.706,10.000,0.000},
				{-20060.587,-1479.453,10.000,0.000},
				{-20207.620,-1461.201,10.000,0.000},
				{-20352.827,-1442.948,10.000,0.000},
				{-20496.210,-1424.695,10.000,0.000},
				{-20637.766,-1406.442,10.000,0.000},
				{-20777.498,-1388.189,10.000,0.000},
				{-20915.404,-1369.937,10.000,0.000},
				{-21051.485,-1351.684,10.000,0.000},
				{-21185.741,-1333.431,10.000,0.000},
				{-21318.172,-1315.178,10.000,0.000},
				{-21448.777,-1296.925,10.000,0.000},
				{-21577.557,-1278.673,10.000,0.000},
				{-21704.511,-1260.420,10.000,0.000},
				{-21829.641,-1242.167,10.000,0.000},
				{-21952.945,-1223.914,10.000,0.000},
				{-22074.423,-1205.661,10.000,0.000},
				{-22194.077,-1187.408,10.000,0.000},
				{-22311.905,-1169.156,10.000,0.000},
				{-22427.908,-1150.903,10.000,0.000},
				{-22542.086,-1132.650,10.000,0.000},
				{-22654.438,-1114.397,10.000,0.000},
				{-22764.965,-1096.144,10.000,0.000},
				{-22873.667,-1077.892,10.000,0.000},
				{-22980.543,-1059.639,10.000,0.000},
				{-23085.595,-1041.386,10.000,0.000},
				{-23188.821,-1023.133,10.000,0.000},
				{-23290.221,-1004.880,10.000,0.000},
				{-23389.797,-986.627,10.000,0.000},
				{-23487.547,-968.375,10.000,0.000},
				{-23583.472,-950.122,10.000,0.000},
				{-23677.571,-931.869,10.000,0.000},
				{-23769.845,-913.616,10.000,0.000},
				{-23860.294,-895.363,10.000,0.000},
				{-23948.918,-877.111,10.000,0.000},
				{-24035.716,-858.858,10.000,0.000},
				{-24120.690,-840.605,10.000,0.000},
				{-24203.837,-822.352,10.000,0.000},
				{-24285.160,-804.099,10.000,0.000},
				{-24364.657,-785.846,10.000,0.000},
				{-24442.329,-767.594,10.000,0.000},
				{-24518.176,-749.341,10.000,0.000},
				{-24592.197,-731.088,10.000,0.000},
				{-24664.394,-712.835,10.000,0.000},
				{-24734.764,-694.582,10.000,0.000},
				{-24803.310,-676.330,10.000,0.000},
				{-24870.030,-658.077,10.000,0.000},
				{-24934.925,-639.824,10.000,0.000},
				{-24997.995,-621.571,10.000,0.000},
				{-25059.240,-603.318,10.000,0.000},
				{-25118.659,-585.065,10.000,0.000},
				{-25176.253,-566.813,10.000,0.000},
				{-25232.021,-548.560,10.000,0.000},
				{-25285.965,-530.307,10.000,0.000},
				{-25338.083,-512.054,10.000,0.000},
				{-25388.376,-493.801,10.000,0.000},
				{-25436.843,-475.549,10.000,0.000},
				{-25483.485,-457.296,10.000,0.000},
				{-25528.302,-439.043,10.000,0.000},
				{-25571.294,-420.790,10.000,0.000},
				{-25612.460,-402.537,10.000,0.000},
				{-25651.801,-384.284,10.000,0.000},
				{-25689.317,-366.032,10.000,0.000},
				{-25725.008,-347.779,10.000,0.000},
				{-25758.873,-329.526,10.000,0.000},
				{-25790.913,-311.273,10.000,0.000},
				{-25821.127,-293.020,10.000,0.000},
				{-25849.517,-274.768,10.000,0.000},
				{-25876.081,-256.515,10.000,0.000},
				{-25900.820,-238.262,10.000,0.000},
				{-25923.733,-220.009,10.000,0.000},
				{-25944.822,-201.756,10.000,0.000},
				{-25964.085,-183.504,10.000,0.000},
				{-25981.522,-165.251,10.000,0.000},
				{-25997.135,-146.998,10.000,0.000},
				{-26010.947,-129.255,10.000,0.000},
				{-26023.043,-112.652,10.000,0.000},
				{-26033.535,-97.190,10.000,0.000},
				{-26042.538,-82.869,10.000,0.000},
				{-26050.166,-69.689,10.000,0.000},
				{-26056.533,-57.650,10.000,0.000},
				{-26061.753,-46.751,10.000,0.000},
				{-26065.940,-36.993,10.000,0.000},
				{-26069.208,-28.376,10.000,0.000},
				{-26071.672,-20.900,10.000,0.000},
				{-26073.445,-14.565,10.000,0.000},
				{-26074.642,-9.370,10.000,0.000},
				{-26075.377,-5.316,10.000,0.000},
				{-26075.763,-2.404,10.000,0.000},
				{-26075.914,-0.631,10.000,0.000},
				{-26075.946,-0.000,10.000,0.000},
				{-26075.946,-0.000,10.000,0.000}		};

}