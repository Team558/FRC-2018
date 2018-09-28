package org.usfirst.frc.team558.robot.scale_Paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleLeftScaleBackArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.31,23.15,0.00)
	// (14.77,23.15,0.00)
	// (27.09,19.13,0.00)
	
    public doubleLeftScaleBackArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleLeftScaleBackArc(boolean flipped) {
		super();
		this.highGear = false;
		this.flipped = flipped;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	public boolean highGear = false;

	double[][] centerPoints = {
				{-0.073,-1.467,10.000,0.000},
				{-0.367,-4.400,10.000,0.000},
				{-1.027,-8.801,10.000,0.000},
				{-2.200,-14.668,10.000,0.000},
				{-4.034,-22.002,10.000,0.000},
				{-6.674,-30.802,10.000,0.000},
				{-10.267,-41.070,10.000,0.000},
				{-14.961,-52.804,10.000,0.000},
				{-20.902,-66.005,10.000,0.000},
				{-28.235,-80.672,10.000,0.000},
				{-37.109,-96.807,10.000,0.000},
				{-47.670,-114.408,10.000,0.000},
				{-60.064,-133.476,10.000,0.000},
				{-74.439,-154.011,10.000,0.000},
				{-90.940,-176.013,10.000,0.000},
				{-109.715,-199.481,10.000,0.000},
				{-130.836,-222.949,10.000,0.000},
				{-154.304,-246.418,10.000,0.000},
				{-180.120,-269.886,10.000,0.000},
				{-208.282,-293.354,10.000,0.000},
				{-238.790,-316.823,10.000,0.000},
				{-271.646,-340.291,10.000,0.000},
				{-306.849,-363.759,10.000,0.000},
				{-344.398,-387.228,10.000,0.000},
				{-384.294,-410.696,10.000,0.000},
				{-426.537,-434.164,10.000,0.000},
				{-471.127,-457.633,10.000,0.000},
				{-518.064,-481.101,10.000,0.000},
				{-567.347,-504.570,10.000,0.000},
				{-618.978,-528.038,10.000,0.000},
				{-672.955,-551.506,10.000,0.000},
				{-729.279,-574.975,10.000,0.000},
				{-787.950,-598.443,10.000,0.000},
				{-848.968,-621.911,10.000,0.000},
				{-912.332,-645.380,10.000,0.000},
				{-978.044,-668.848,10.000,0.000},
				{-1046.102,-692.316,10.000,0.000},
				{-1116.507,-715.785,10.000,0.000},
				{-1189.259,-739.253,10.000,0.000},
				{-1264.357,-762.721,10.000,0.000},
				{-1341.803,-786.190,10.000,0.000},
				{-1421.595,-809.658,10.000,0.000},
				{-1503.735,-833.126,10.000,0.000},
				{-1588.221,-856.595,10.000,0.000},
				{-1675.054,-880.063,10.000,0.000},
				{-1764.233,-903.532,10.000,0.000},
				{-1855.760,-927.000,10.000,0.000},
				{-1949.633,-950.468,10.000,0.000},
				{-2045.854,-973.937,10.000,0.000},
				{-2144.421,-997.405,10.000,0.000},
				{-2245.335,-1020.873,10.000,0.000},
				{-2348.595,-1044.342,10.000,0.000},
				{-2454.203,-1067.810,10.000,0.000},
				{-2562.157,-1091.278,10.000,0.000},
				{-2672.459,-1114.747,10.000,0.000},
				{-2785.107,-1138.215,10.000,0.000},
				{-2900.102,-1161.683,10.000,0.000},
				{-3017.443,-1185.152,10.000,0.000},
				{-3137.132,-1208.620,10.000,0.000},
				{-3259.167,-1232.088,10.000,0.000},
				{-3383.550,-1255.557,10.000,0.000},
				{-3510.279,-1279.025,10.000,0.000},
				{-3639.355,-1302.493,10.000,0.000},
				{-3770.777,-1325.962,10.000,0.000},
				{-3904.547,-1349.430,10.000,0.000},
				{-4040.663,-1372.899,10.000,0.000},
				{-4179.127,-1396.367,10.000,0.000},
				{-4319.937,-1419.835,10.000,0.000},
				{-4463.094,-1443.304,10.000,0.000},
				{-4608.597,-1466.772,10.000,0.000},
				{-4756.448,-1490.240,10.000,0.000},
				{-4906.646,-1513.709,10.000,0.000},
				{-5059.190,-1537.177,10.000,0.000},
				{-5214.081,-1560.645,10.000,0.000},
				{-5371.319,-1584.114,10.000,0.000},
				{-5530.904,-1607.582,10.000,0.000},
				{-5692.835,-1631.050,10.000,0.000},
				{-5857.114,-1654.519,10.000,0.000},
				{-6023.739,-1677.987,10.000,0.000},
				{-6192.711,-1701.455,10.000,0.000},
				{-6364.030,-1724.924,10.000,0.000},
				{-6537.696,-1748.392,10.000,0.000},
				{-6713.709,-1771.861,10.000,0.000},
				{-6892.068,-1795.329,10.000,0.000},
				{-7072.774,-1818.797,10.000,0.000},
				{-7255.828,-1842.266,10.000,0.000},
				{-7441.227,-1865.734,10.000,0.000},
				{-7628.974,-1889.202,10.000,0.000},
				{-7819.068,-1912.671,10.000,0.000},
				{-8011.508,-1936.139,10.000,0.000},
				{-8206.296,-1959.607,10.000,0.000},
				{-8403.430,-1983.076,10.000,0.000},
				{-8602.911,-2006.544,10.000,0.000},
				{-8804.739,-2030.012,10.000,0.000},
				{-9008.913,-2053.481,10.000,0.000},
				{-9215.435,-2076.949,10.000,0.000},
				{-9424.303,-2100.417,10.000,0.000},
				{-9635.518,-2123.886,10.000,0.000},
				{-9849.080,-2147.354,10.000,0.000},
				{-10064.989,-2170.822,10.000,0.000},
				{-10283.245,-2194.291,10.000,0.000},
				{-10503.847,-2217.759,10.000,0.000},
				{-10726.797,-2241.228,10.000,0.000},
				{-10952.093,-2264.696,10.000,0.000},
				{-11179.736,-2288.164,10.000,0.000},
				{-11409.726,-2311.633,10.000,0.000},
				{-11642.062,-2335.101,10.000,0.000},
				{-11876.746,-2358.569,10.000,0.000},
				{-12113.776,-2382.038,10.000,0.000},
				{-12353.153,-2405.506,10.000,0.000},
				{-12594.877,-2428.974,10.000,0.000},
				{-12838.948,-2452.443,10.000,0.000},
				{-13085.366,-2475.911,10.000,0.000},
				{-13334.130,-2499.379,10.000,0.000},
				{-13585.242,-2522.848,10.000,0.000},
				{-13838.700,-2546.316,10.000,0.000},
				{-14094.505,-2569.784,10.000,0.000},
				{-14352.657,-2593.253,10.000,0.000},
				{-14613.156,-2616.721,10.000,0.000},
				{-14876.001,-2640.190,10.000,0.000},
				{-15141.120,-2662.191,10.000,0.000},
				{-15408.366,-2682.726,10.000,0.000},
				{-15677.592,-2701.794,10.000,0.000},
				{-15948.652,-2719.395,10.000,0.000},
				{-16221.398,-2735.530,10.000,0.000},
				{-16495.684,-2750.197,10.000,0.000},
				{-16771.364,-2763.398,10.000,0.000},
				{-17048.290,-2775.133,10.000,0.000},
				{-17326.317,-2785.400,10.000,0.000},
				{-17605.297,-2794.201,10.000,0.000},
				{-17885.084,-2801.534,10.000,0.000},
				{-18165.531,-2807.402,10.000,0.000},
				{-18446.491,-2811.802,10.000,0.000},
				{-18727.818,-2814.735,10.000,0.000},
				{-19009.365,-2816.202,10.000,0.000},
				{-19290.985,-2816.202,10.000,0.000},
				{-19572.605,-2816.202,10.000,0.000},
				{-19854.225,-2816.202,10.000,0.000},
				{-20135.845,-2816.202,10.000,0.000},
				{-20417.466,-2816.202,10.000,0.000},
				{-20699.086,-2816.202,10.000,0.000},
				{-20980.706,-2816.202,10.000,0.000},
				{-21262.326,-2816.202,10.000,0.000},
				{-21543.946,-2816.202,10.000,0.000},
				{-21825.567,-2816.202,10.000,0.000},
				{-22107.187,-2816.202,10.000,0.000},
				{-22388.807,-2816.202,10.000,0.000},
				{-22670.427,-2816.202,10.000,0.000},
				{-22952.048,-2816.202,10.000,0.000},
				{-23233.668,-2816.202,10.000,0.000},
				{-23515.288,-2816.202,10.000,0.000},
				{-23796.908,-2816.202,10.000,0.000},
				{-24078.528,-2816.202,10.000,0.000},
				{-24360.149,-2816.202,10.000,0.000},
				{-24641.769,-2816.202,10.000,0.000},
				{-24923.389,-2816.202,10.000,0.000},
				{-25205.009,-2816.202,10.000,0.000},
				{-25486.629,-2816.202,10.000,0.000},
				{-25768.250,-2816.202,10.000,0.000},
				{-26049.870,-2816.202,10.000,0.000},
				{-26331.490,-2816.202,10.000,0.000},
				{-26613.110,-2816.202,10.000,0.000},
				{-26894.731,-2816.202,10.000,0.000},
				{-27176.351,-2816.202,10.000,0.000},
				{-27457.971,-2816.202,10.000,0.000},
				{-27739.591,-2816.202,10.000,0.000},
				{-28021.211,-2816.202,10.000,0.000},
				{-28302.832,-2816.202,10.000,0.000},
				{-28584.452,-2816.202,10.000,0.000},
				{-28866.072,-2816.202,10.000,0.000},
				{-29147.692,-2816.202,10.000,0.000},
				{-29429.313,-2816.202,10.000,0.000},
				{-29710.933,-2816.202,10.000,0.000},
				{-29992.553,-2816.202,10.000,0.000},
				{-30274.173,-2816.202,10.000,0.000},
				{-30555.793,-2816.202,10.000,0.000},
				{-30837.414,-2816.202,10.000,0.000},
				{-31119.034,-2816.202,10.000,0.000},
				{-31400.654,-2816.202,10.000,0.000},
				{-31682.274,-2816.202,10.000,-0.004},
				{-31963.894,-2816.202,10.000,-0.068},
				{-32245.515,-2816.202,10.000,-0.206},
				{-32527.135,-2816.202,10.000,-0.413},
				{-32808.755,-2816.202,10.000,-0.687},
				{-33090.375,-2816.202,10.000,-1.024},
				{-33371.996,-2816.202,10.000,-1.423},
				{-33653.616,-2816.202,10.000,-1.880},
				{-33935.236,-2816.202,10.000,-2.393},
				{-34216.856,-2816.202,10.000,-2.958},
				{-34498.476,-2816.202,10.000,-3.574},
				{-34780.097,-2816.202,10.000,-4.238},
				{-35061.717,-2816.202,10.000,-4.947},
				{-35343.337,-2816.202,10.000,-5.699},
				{-35624.957,-2816.202,10.000,-6.490},
				{-35906.577,-2816.202,10.000,-7.318},
				{-36188.198,-2816.202,10.000,-8.178},
				{-36469.818,-2816.202,10.000,-9.069},
				{-36751.438,-2816.202,10.000,-9.986},
				{-37033.058,-2816.202,10.000,-10.926},
				{-37314.679,-2816.202,10.000,-11.884},
				{-37596.299,-2816.202,10.000,-12.858},
				{-37877.919,-2816.202,10.000,-13.843},
				{-38159.539,-2816.202,10.000,-14.836},
				{-38441.159,-2816.202,10.000,-15.831},
				{-38722.780,-2816.202,10.000,-16.826},
				{-39004.400,-2816.202,10.000,-17.817},
				{-39286.020,-2816.202,10.000,-18.799},
				{-39567.640,-2816.202,10.000,-19.770},
				{-39849.260,-2816.202,10.000,-20.725},
				{-40130.881,-2816.202,10.000,-21.662},
				{-40412.501,-2816.202,10.000,-22.577},
				{-40694.121,-2816.202,10.000,-23.468},
				{-40975.741,-2816.202,10.000,-24.332},
				{-41257.362,-2816.202,10.000,-25.167},
				{-41538.982,-2816.202,10.000,-25.971},
				{-41820.602,-2816.202,10.000,-26.742},
				{-42102.222,-2816.202,10.000,-27.478},
				{-42383.842,-2816.202,10.000,-28.179},
				{-42665.463,-2816.202,10.000,-28.842},
				{-42947.083,-2816.202,10.000,-29.467},
				{-43228.703,-2816.202,10.000,-30.054},
				{-43510.323,-2816.202,10.000,-30.601},
				{-43791.913,-2815.590,10.000,-31.108},
				{-44073.368,-2813.512,10.000,-31.574},
				{-44354.542,-2809.967,10.000,-32.000},
				{-44635.288,-2804.954,10.000,-32.384},
				{-44915.459,-2798.476,10.000,-32.727},
				{-45194.910,-2790.530,10.000,-33.029},
				{-45473.492,-2781.118,10.000,-33.289},
				{-45751.060,-2770.238,10.000,-33.509},
				{-46027.466,-2757.892,10.000,-33.687},
				{-46302.565,-2744.080,10.000,-33.826},
				{-46576.209,-2728.800,10.000,-33.925},
				{-46848.252,-2712.054,10.000,-33.985},
				{-47118.547,-2693.841,10.000,-34.006},
				{-47386.947,-2674.161,10.000,-33.990},
				{-47653.305,-2653.015,10.000,-33.937},
				{-47917.476,-2630.401,10.000,-33.848},
				{-48179.343,-2606.933,10.000,-33.724},
				{-48438.863,-2583.464,10.000,-33.566},
				{-48696.036,-2559.996,10.000,-33.375},
				{-48950.862,-2536.528,10.000,-33.152},
				{-49203.341,-2513.059,10.000,-32.898},
				{-49453.474,-2489.591,10.000,-32.614},
				{-49701.260,-2466.123,10.000,-32.300},
				{-49946.698,-2442.654,10.000,-31.958},
				{-50189.790,-2419.186,10.000,-31.589},
				{-50430.536,-2395.718,10.000,-31.193},
				{-50668.934,-2372.249,10.000,-30.773},
				{-50904.985,-2348.781,10.000,-30.328},
				{-51138.690,-2325.313,10.000,-29.860},
				{-51370.048,-2301.844,10.000,-29.370},
				{-51599.059,-2278.376,10.000,-28.860},
				{-51825.723,-2254.908,10.000,-28.329},
				{-52050.040,-2231.439,10.000,-27.781},
				{-52272.011,-2207.971,10.000,-27.216},
				{-52491.635,-2184.502,10.000,-26.635},
				{-52708.911,-2161.034,10.000,-26.039},
				{-52923.841,-2137.566,10.000,-25.431},
				{-53136.425,-2114.097,10.000,-24.811},
				{-53346.661,-2090.629,10.000,-24.180},
				{-53554.550,-2067.161,10.000,-23.542},
				{-53760.093,-2043.692,10.000,-22.895},
				{-53963.289,-2020.224,10.000,-22.243},
				{-54164.138,-1996.756,10.000,-21.587},
				{-54362.640,-1973.287,10.000,-20.928},
				{-54558.795,-1949.819,10.000,-20.267},
				{-54752.604,-1926.351,10.000,-19.605},
				{-54944.065,-1902.882,10.000,-18.945},
				{-55133.180,-1879.414,10.000,-18.288},
				{-55319.948,-1855.946,10.000,-17.634},
				{-55504.369,-1832.477,10.000,-16.985},
				{-55686.444,-1809.009,10.000,-16.343},
				{-55866.171,-1785.541,10.000,-15.707},
				{-56043.552,-1762.072,10.000,-15.080},
				{-56218.586,-1738.604,10.000,-14.462},
				{-56391.273,-1715.135,10.000,-13.854},
				{-56561.613,-1691.667,10.000,-13.257},
				{-56729.606,-1668.199,10.000,-12.672},
				{-56895.252,-1644.730,10.000,-12.099},
				{-57058.552,-1621.262,10.000,-11.539},
				{-57219.505,-1597.794,10.000,-10.992},
				{-57378.111,-1574.325,10.000,-10.459},
				{-57534.370,-1550.857,10.000,-9.941},
				{-57688.282,-1527.389,10.000,-9.438},
				{-57839.848,-1503.920,10.000,-8.949},
				{-57989.066,-1480.452,10.000,-8.475},
				{-58135.938,-1456.984,10.000,-8.017},
				{-58280.463,-1433.515,10.000,-7.575},
				{-58422.641,-1410.047,10.000,-7.147},
				{-58562.472,-1386.579,10.000,-6.736},
				{-58699.957,-1363.110,10.000,-6.339},
				{-58835.094,-1339.642,10.000,-5.958},
				{-58967.885,-1316.173,10.000,-5.593},
				{-59098.329,-1292.705,10.000,-5.242},
				{-59226.426,-1269.237,10.000,-4.906},
				{-59352.176,-1245.768,10.000,-4.585},
				{-59475.580,-1222.300,10.000,-4.279},
				{-59596.636,-1198.832,10.000,-3.987},
				{-59715.346,-1175.363,10.000,-3.708},
				{-59831.709,-1151.895,10.000,-3.444},
				{-59945.725,-1128.427,10.000,-3.192},
				{-60057.394,-1104.958,10.000,-2.954},
				{-60166.717,-1081.490,10.000,-2.728},
				{-60273.692,-1058.022,10.000,-2.515},
				{-60378.321,-1034.553,10.000,-2.314},
				{-60480.603,-1011.085,10.000,-2.124},
				{-60580.538,-987.617,10.000,-1.946},
				{-60678.126,-964.148,10.000,-1.779},
				{-60773.368,-940.680,10.000,-1.622},
				{-60866.262,-917.212,10.000,-1.475},
				{-60956.810,-893.743,10.000,-1.338},
				{-61045.011,-870.275,10.000,-1.211},
				{-61130.865,-846.806,10.000,-1.092},
				{-61214.372,-823.338,10.000,-0.982},
				{-61295.533,-799.870,10.000,-0.881},
				{-61374.346,-776.401,10.000,-0.787},
				{-61450.813,-752.933,10.000,-0.701},
				{-61524.933,-729.465,10.000,-0.621},
				{-61596.706,-705.996,10.000,-0.549},
				{-61666.132,-682.528,10.000,-0.483},
				{-61733.212,-659.060,10.000,-0.423},
				{-61797.944,-635.591,10.000,-0.369},
				{-61860.330,-612.123,10.000,-0.320},
				{-61920.369,-588.655,10.000,-0.276},
				{-61978.061,-565.186,10.000,-0.236},
				{-62033.406,-541.718,10.000,-0.201},
				{-62086.404,-518.250,10.000,-0.171},
				{-62137.056,-494.781,10.000,-0.143},
				{-62185.361,-471.313,10.000,-0.119},
				{-62231.318,-447.844,10.000,-0.099},
				{-62274.929,-424.376,10.000,-0.081},
				{-62316.194,-400.908,10.000,-0.065},
				{-62355.111,-377.439,10.000,-0.052},
				{-62391.681,-353.971,10.000,-0.042},
				{-62425.905,-330.503,10.000,-0.032},
				{-62457.782,-307.034,10.000,-0.025},
				{-62487.312,-283.566,10.000,-0.019},
				{-62514.495,-260.098,10.000,-0.014},
				{-62539.332,-236.629,10.000,-0.010},
				{-62561.821,-213.161,10.000,-0.007},
				{-62581.964,-189.693,10.000,-0.005},
				{-62599.790,-166.836,10.000,-0.003},
				{-62615.404,-145.446,10.000,-0.002},
				{-62628.953,-125.523,10.000,-0.001},
				{-62640.582,-107.067,10.000,-0.001},
				{-62650.440,-90.077,10.000,-0.001},
				{-62658.671,-74.555,10.000,-0.000},
				{-62665.424,-60.499,10.000,-0.000},
				{-62670.844,-47.910,10.000,-0.000},
				{-62675.079,-36.787,10.000,-0.000},
				{-62678.275,-27.132,10.000,-0.000},
				{-62680.579,-18.943,10.000,-0.000},
				{-62682.137,-12.221,10.000,-0.000},
				{-62683.096,-6.965,10.000,-0.000},
				{-62683.603,-3.177,10.000,-0.000},
				{-62683.805,-0.855,10.000,-0.000},
				{-62683.848,-0.000,10.000,-0.000},
				{-62683.848,-0.000,10.000,-0.000}		};

}