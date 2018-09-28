package org.usfirst.frc.team558.robot.center_paths;

import org.usfirst.frc.team558.robot.util.*;

public class CenterLeftAutoArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.31,13.08,0.00)
	// (11.08,17.78,0.00)
	
    public CenterLeftAutoArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public CenterLeftAutoArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{-0.057,-1.139,10.000,0.000},
				{-0.285,-3.418,10.000,0.000},
				{-0.798,-6.837,10.000,0.000},
				{-1.709,-11.394,10.000,0.000},
				{-3.133,-17.091,10.000,0.000},
				{-5.184,-23.928,10.000,0.000},
				{-7.976,-31.904,10.000,0.000},
				{-11.622,-41.019,10.000,0.000},
				{-16.237,-51.274,10.000,0.000},
				{-21.934,-62.669,10.000,0.000},
				{-28.828,-75.202,10.000,0.001},
				{-37.031,-88.875,10.000,0.001},
				{-46.660,-103.688,10.000,0.001},
				{-57.826,-119.640,10.000,0.002},
				{-70.645,-136.731,10.000,0.003},
				{-85.229,-154.962,10.000,0.005},
				{-101.637,-173.193,10.000,0.007},
				{-119.868,-191.424,10.000,0.010},
				{-139.922,-209.655,10.000,0.013},
				{-161.799,-227.886,10.000,0.018},
				{-185.499,-246.117,10.000,0.023},
				{-211.022,-264.347,10.000,0.030},
				{-238.368,-282.578,10.000,0.038},
				{-267.538,-300.809,10.000,0.048},
				{-298.530,-319.040,10.000,0.060},
				{-331.346,-337.271,10.000,0.073},
				{-365.984,-355.502,10.000,0.089},
				{-402.446,-373.733,10.000,0.108},
				{-440.731,-391.963,10.000,0.129},
				{-480.839,-410.194,10.000,0.153},
				{-522.770,-428.425,10.000,0.181},
				{-566.524,-446.656,10.000,0.212},
				{-612.101,-464.887,10.000,0.247},
				{-659.501,-483.118,10.000,0.286},
				{-708.725,-501.349,10.000,0.329},
				{-759.771,-519.579,10.000,0.377},
				{-812.640,-537.810,10.000,0.430},
				{-867.333,-556.041,10.000,0.489},
				{-923.849,-574.272,10.000,0.553},
				{-982.187,-592.503,10.000,0.623},
				{-1042.349,-610.734,10.000,0.700},
				{-1104.334,-628.965,10.000,0.783},
				{-1168.142,-647.195,10.000,0.873},
				{-1233.773,-665.426,10.000,0.971},
				{-1301.227,-683.657,10.000,1.077},
				{-1370.505,-701.888,10.000,1.191},
				{-1441.605,-720.119,10.000,1.314},
				{-1514.528,-738.350,10.000,1.445},
				{-1589.275,-756.581,10.000,1.587},
				{-1665.845,-774.811,10.000,1.738},
				{-1744.237,-793.042,10.000,1.899},
				{-1824.453,-811.273,10.000,2.071},
				{-1906.492,-829.504,10.000,2.254},
				{-1990.354,-847.735,10.000,2.449},
				{-2076.039,-865.966,10.000,2.656},
				{-2163.547,-884.197,10.000,2.875},
				{-2252.878,-902.427,10.000,3.107},
				{-2344.032,-920.658,10.000,3.352},
				{-2437.010,-938.889,10.000,3.612},
				{-2531.810,-957.120,10.000,3.885},
				{-2628.434,-975.351,10.000,4.174},
				{-2726.880,-993.582,10.000,4.477},
				{-2827.150,-1011.813,10.000,4.797},
				{-2929.243,-1030.043,10.000,5.132},
				{-3033.159,-1048.274,10.000,5.484},
				{-3138.898,-1066.505,10.000,5.853},
				{-3246.460,-1084.736,10.000,6.240},
				{-3355.845,-1102.967,10.000,6.644},
				{-3467.053,-1121.198,10.000,7.067},
				{-3580.084,-1139.429,10.000,7.508},
				{-3694.939,-1157.659,10.000,7.969},
				{-3811.616,-1175.890,10.000,8.449},
				{-3930.117,-1194.121,10.000,8.949},
				{-4050.441,-1212.352,10.000,9.469},
				{-4172.587,-1230.583,10.000,10.009},
				{-4296.557,-1248.814,10.000,10.570},
				{-4422.350,-1267.045,10.000,11.151},
				{-4549.966,-1285.275,10.000,11.753},
				{-4679.405,-1303.506,10.000,12.376},
				{-4810.667,-1321.737,10.000,13.019},
				{-4943.753,-1339.968,10.000,13.683},
				{-5078.661,-1358.199,10.000,14.368},
				{-5215.392,-1376.430,10.000,15.073},
				{-5353.947,-1394.661,10.000,15.797},
				{-5494.324,-1412.891,10.000,16.541},
				{-5636.525,-1431.122,10.000,17.303},
				{-5780.549,-1449.353,10.000,18.083},
				{-5926.396,-1467.584,10.000,18.881},
				{-6074.066,-1485.815,10.000,19.695},
				{-6223.559,-1504.046,10.000,20.523},
				{-6374.875,-1522.277,10.000,21.366},
				{-6528.014,-1540.507,10.000,22.222},
				{-6682.976,-1558.738,10.000,23.089},
				{-6839.762,-1576.969,10.000,23.966},
				{-6998.370,-1595.200,10.000,24.851},
				{-7158.802,-1613.431,10.000,25.743},
				{-7321.056,-1631.662,10.000,26.640},
				{-7485.134,-1649.893,10.000,27.540},
				{-7651.035,-1668.123,10.000,28.441},
				{-7818.759,-1686.354,10.000,29.341},
				{-7988.306,-1704.585,10.000,30.238},
				{-8159.676,-1722.816,10.000,31.131},
				{-8332.869,-1741.047,10.000,32.018},
				{-8507.885,-1759.278,10.000,32.896},
				{-8684.724,-1777.509,10.000,33.763},
				{-8863.387,-1795.739,10.000,34.619},
				{-9043.872,-1813.970,10.000,35.461},
				{-9226.181,-1832.201,10.000,36.286},
				{-9410.312,-1850.432,10.000,37.095},
				{-9596.267,-1868.663,10.000,37.885},
				{-9784.045,-1886.894,10.000,38.655},
				{-9973.646,-1905.125,10.000,39.402},
				{-10165.070,-1923.355,10.000,40.127},
				{-10358.317,-1941.586,10.000,40.828},
				{-10553.387,-1959.817,10.000,41.504},
				{-10750.280,-1978.048,10.000,42.153},
				{-10948.997,-1996.279,10.000,42.775},
				{-11149.536,-2014.510,10.000,43.369},
				{-11351.899,-2032.741,10.000,43.934},
				{-11556.084,-2050.971,10.000,44.469},
				{-11762.036,-2068.063,10.000,44.974},
				{-11969.640,-2084.015,10.000,45.448},
				{-12178.782,-2098.827,10.000,45.889},
				{-12389.348,-2112.501,10.000,46.298},
				{-12601.225,-2125.034,10.000,46.673},
				{-12814.298,-2136.429,10.000,47.015},
				{-13028.454,-2146.683,10.000,47.322},
				{-13243.578,-2155.799,10.000,47.595},
				{-13459.557,-2163.775,10.000,47.833},
				{-13676.276,-2170.611,10.000,48.036},
				{-13893.622,-2176.309,10.000,48.203},
				{-14111.481,-2180.866,10.000,48.335},
				{-14329.738,-2184.285,10.000,48.432},
				{-14548.281,-2186.563,10.000,48.492},
				{-14766.994,-2187.703,10.000,48.518},
				{-14985.731,-2187.029,10.000,48.507},
				{-15204.343,-2185.216,10.000,48.461},
				{-15422.717,-2182.264,10.000,48.379},
				{-15640.739,-2178.172,10.000,48.261},
				{-15858.294,-2172.941,10.000,48.108},
				{-16075.270,-2166.570,10.000,47.920},
				{-16291.551,-2159.060,10.000,47.697},
				{-16507.025,-2150.411,10.000,47.438},
				{-16721.577,-2140.622,10.000,47.145},
				{-16935.092,-2129.694,10.000,46.817},
				{-17147.458,-2117.626,10.000,46.456},
				{-17358.561,-2104.419,10.000,46.061},
				{-17568.285,-2090.072,10.000,45.633},
				{-17776.518,-2074.586,10.000,45.172},
				{-17983.145,-2057.960,10.000,44.680},
				{-18188.053,-2040.195,10.000,44.157},
				{-18391.161,-2021.965,10.000,43.604},
				{-18592.446,-2003.734,10.000,43.022},
				{-18791.908,-1985.503,10.000,42.411},
				{-18989.547,-1967.272,10.000,41.773},
				{-19185.362,-1949.041,10.000,41.108},
				{-19379.355,-1930.810,10.000,40.418},
				{-19571.524,-1912.579,10.000,39.703},
				{-19761.871,-1894.349,10.000,38.964},
				{-19950.394,-1876.118,10.000,38.203},
				{-20137.094,-1857.887,10.000,37.421},
				{-20321.971,-1839.656,10.000,36.620},
				{-20505.025,-1821.425,10.000,35.801},
				{-20686.256,-1803.194,10.000,34.966},
				{-20865.664,-1784.963,10.000,34.116},
				{-21043.249,-1766.733,10.000,33.253},
				{-21219.011,-1748.502,10.000,32.379},
				{-21392.949,-1730.271,10.000,31.496},
				{-21565.065,-1712.040,10.000,30.605},
				{-21735.357,-1693.809,10.000,29.709},
				{-21903.827,-1675.578,10.000,28.810},
				{-22070.473,-1657.347,10.000,27.909},
				{-22235.296,-1639.117,10.000,27.009},
				{-22398.296,-1620.886,10.000,26.111},
				{-22559.473,-1602.655,10.000,25.217},
				{-22718.827,-1584.424,10.000,24.328},
				{-22876.358,-1566.193,10.000,23.448},
				{-23032.066,-1547.962,10.000,22.577},
				{-23185.951,-1529.731,10.000,21.716},
				{-23338.012,-1511.501,10.000,20.868},
				{-23488.251,-1493.270,10.000,20.033},
				{-23636.666,-1475.039,10.000,19.213},
				{-23783.259,-1456.808,10.000,18.409},
				{-23928.028,-1438.577,10.000,17.621},
				{-24070.974,-1420.346,10.000,16.851},
				{-24212.097,-1402.115,10.000,16.100},
				{-24351.397,-1383.885,10.000,15.368},
				{-24488.874,-1365.654,10.000,14.655},
				{-24624.528,-1347.423,10.000,13.962},
				{-24758.359,-1329.192,10.000,13.289},
				{-24890.366,-1310.961,10.000,12.637},
				{-25020.551,-1292.730,10.000,12.006},
				{-25148.912,-1274.499,10.000,11.396},
				{-25275.451,-1256.269,10.000,10.806},
				{-25400.166,-1238.038,10.000,10.237},
				{-25523.058,-1219.807,10.000,9.688},
				{-25644.127,-1201.576,10.000,9.160},
				{-25763.373,-1183.345,10.000,8.652},
				{-25880.796,-1165.114,10.000,8.164},
				{-25996.396,-1146.883,10.000,7.695},
				{-26110.173,-1128.653,10.000,7.246},
				{-26222.127,-1110.422,10.000,6.816},
				{-26332.257,-1092.191,10.000,6.404},
				{-26440.565,-1073.960,10.000,6.010},
				{-26547.049,-1055.729,10.000,5.634},
				{-26651.711,-1037.498,10.000,5.275},
				{-26754.549,-1019.267,10.000,4.933},
				{-26855.564,-1001.037,10.000,4.607},
				{-26954.756,-982.806,10.000,4.297},
				{-27052.125,-964.575,10.000,4.002},
				{-27147.671,-946.344,10.000,3.722},
				{-27241.394,-928.113,10.000,3.457},
				{-27333.294,-909.882,10.000,3.206},
				{-27423.371,-891.651,10.000,2.969},
				{-27511.624,-873.421,10.000,2.744},
				{-27598.055,-855.190,10.000,2.532},
				{-27682.662,-836.959,10.000,2.333},
				{-27765.447,-818.728,10.000,2.145},
				{-27846.408,-800.497,10.000,1.968},
				{-27925.546,-782.266,10.000,1.803},
				{-28002.861,-764.035,10.000,1.648},
				{-28078.353,-745.805,10.000,1.502},
				{-28152.022,-727.574,10.000,1.367},
				{-28223.868,-709.343,10.000,1.241},
				{-28293.891,-691.112,10.000,1.123},
				{-28362.090,-672.881,10.000,1.014},
				{-28428.467,-654.650,10.000,0.913},
				{-28493.020,-636.419,10.000,0.819},
				{-28555.751,-618.189,10.000,0.733},
				{-28616.658,-599.958,10.000,0.654},
				{-28675.742,-581.727,10.000,0.581},
				{-28733.003,-563.496,10.000,0.514},
				{-28788.441,-545.265,10.000,0.454},
				{-28842.056,-527.034,10.000,0.398},
				{-28893.848,-508.803,10.000,0.348},
				{-28943.817,-490.573,10.000,0.303},
				{-28991.963,-472.342,10.000,0.262},
				{-29038.285,-454.111,10.000,0.226},
				{-29082.785,-435.880,10.000,0.193},
				{-29125.461,-417.649,10.000,0.164},
				{-29166.315,-399.418,10.000,0.139},
				{-29205.345,-381.187,10.000,0.116},
				{-29242.552,-362.957,10.000,0.097},
				{-29277.936,-344.726,10.000,0.080},
				{-29311.497,-326.495,10.000,0.065},
				{-29343.235,-308.264,10.000,0.053},
				{-29373.150,-290.033,10.000,0.042},
				{-29401.242,-271.802,10.000,0.033},
				{-29427.511,-253.571,10.000,0.026},
				{-29451.956,-235.341,10.000,0.020},
				{-29474.579,-217.110,10.000,0.015},
				{-29495.378,-198.879,10.000,0.011},
				{-29514.355,-180.648,10.000,0.008},
				{-29531.508,-162.417,10.000,0.006},
				{-29546.838,-144.186,10.000,0.004},
				{-29560.379,-126.629,10.000,0.003},
				{-29572.221,-110.211,10.000,0.002},
				{-29582.478,-94.933,10.000,0.001},
				{-29591.264,-80.793,10.000,0.001},
				{-29598.694,-67.794,10.000,0.000},
				{-29604.880,-55.934,10.000,0.000},
				{-29609.937,-45.213,10.000,0.000},
				{-29613.979,-35.631,10.000,0.000},
				{-29617.121,-27.190,10.000,0.000},
				{-29619.474,-19.887,10.000,0.000},
				{-29621.155,-13.724,10.000,0.000},
				{-29622.276,-8.700,10.000,0.000},
				{-29622.952,-4.816,10.000,0.000},
				{-29623.296,-2.071,10.000,0.000},
				{-29623.423,-0.466,10.000,-0.000},
				{-29623.446,-0.000,10.000,-0.000},
				{-29623.446,-0.000,10.000,-0.000}		};

}