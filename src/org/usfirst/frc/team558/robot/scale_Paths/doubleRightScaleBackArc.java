package org.usfirst.frc.team558.robot.scale_Paths;

import org.usfirst.frc.team558.robot.util.*;

public class doubleRightScaleBackArc extends SrxTrajectory{
	
	// WAYPOINTS:
	// (X,Y,degrees)
	// (1.31,3.79,0.00)
	// (13.77,3.79,0.00)
	// (28.39,7.81,0.00)
	
    public doubleRightScaleBackArc() {
		super();
		this.highGear = false;
		centerProfile = new SrxMotionProfile(centerPoints.length, centerPoints);
	}

	
    public doubleRightScaleBackArc(boolean flipped) {
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
				{-29429.313,-2816.202,10.000,0.011},
				{-29710.933,-2816.202,10.000,0.069},
				{-29992.553,-2816.202,10.000,0.175},
				{-30274.173,-2816.202,10.000,0.326},
				{-30555.793,-2816.202,10.000,0.520},
				{-30837.414,-2816.202,10.000,0.757},
				{-31119.034,-2816.202,10.000,1.033},
				{-31400.654,-2816.202,10.000,1.347},
				{-31682.274,-2816.202,10.000,1.698},
				{-31963.894,-2816.202,10.000,2.084},
				{-32245.515,-2816.202,10.000,2.503},
				{-32527.135,-2816.202,10.000,2.953},
				{-32808.755,-2816.202,10.000,3.434},
				{-33090.375,-2816.202,10.000,3.943},
				{-33371.996,-2816.202,10.000,4.479},
				{-33653.616,-2816.202,10.000,5.040},
				{-33935.236,-2816.202,10.000,5.624},
				{-34216.856,-2816.202,10.000,6.230},
				{-34498.476,-2816.202,10.000,6.855},
				{-34780.097,-2816.202,10.000,7.499},
				{-35061.717,-2816.202,10.000,8.159},
				{-35343.337,-2816.202,10.000,8.832},
				{-35624.957,-2816.202,10.000,9.518},
				{-35906.577,-2816.202,10.000,10.214},
				{-36188.198,-2816.202,10.000,10.919},
				{-36469.818,-2816.202,10.000,11.630},
				{-36751.438,-2816.202,10.000,12.345},
				{-37033.058,-2816.202,10.000,13.062},
				{-37314.679,-2816.202,10.000,13.780},
				{-37596.299,-2816.202,10.000,14.496},
				{-37877.919,-2816.202,10.000,15.209},
				{-38159.539,-2816.202,10.000,15.917},
				{-38441.159,-2816.202,10.000,16.618},
				{-38722.780,-2816.202,10.000,17.310},
				{-39004.400,-2816.202,10.000,17.991},
				{-39286.020,-2816.202,10.000,18.661},
				{-39567.640,-2816.202,10.000,19.317},
				{-39849.260,-2816.202,10.000,19.959},
				{-40130.881,-2816.202,10.000,20.585},
				{-40412.501,-2816.202,10.000,21.193},
				{-40694.121,-2816.202,10.000,21.784},
				{-40975.741,-2816.202,10.000,22.355},
				{-41257.362,-2816.202,10.000,22.905},
				{-41538.982,-2816.202,10.000,23.435},
				{-41820.602,-2816.202,10.000,23.943},
				{-42102.222,-2816.202,10.000,24.428},
				{-42383.842,-2816.202,10.000,24.890},
				{-42665.463,-2816.202,10.000,25.329},
				{-42947.083,-2816.202,10.000,25.744},
				{-43228.703,-2816.202,10.000,26.134},
				{-43510.323,-2816.202,10.000,26.499},
				{-43791.944,-2816.202,10.000,26.839},
				{-44073.564,-2816.202,10.000,27.154},
				{-44355.184,-2816.202,10.000,27.443},
				{-44636.804,-2816.202,10.000,27.706},
				{-44918.424,-2816.202,10.000,27.944},
				{-45200.045,-2816.202,10.000,28.155},
				{-45481.665,-2816.202,10.000,28.340},
				{-45763.285,-2816.202,10.000,28.499},
				{-46044.905,-2816.202,10.000,28.632},
				{-46326.525,-2816.202,10.000,28.738},
				{-46608.088,-2815.044,10.000,28.818},
				{-46889.461,-2812.420,10.000,28.872},
				{-47170.498,-2808.329,10.000,28.899},
				{-47451.053,-2802.771,10.000,28.899},
				{-47730.979,-2795.746,10.000,28.874},
				{-48010.129,-2787.255,10.000,28.823},
				{-48288.357,-2777.296,10.000,28.746},
				{-48565.515,-2765.871,10.000,28.643},
				{-48841.458,-2752.979,10.000,28.516},
				{-49116.038,-2738.621,10.000,28.364},
				{-49389.109,-2722.795,10.000,28.188},
				{-49660.523,-2705.503,10.000,27.989},
				{-49930.136,-2686.744,10.000,27.768},
				{-50197.799,-2666.518,10.000,27.524},
				{-50463.366,-2644.826,10.000,27.259},
				{-50726.691,-2621.667,10.000,26.974},
				{-50987.684,-2598.198,10.000,26.670},
				{-51246.330,-2574.730,10.000,26.347},
				{-51502.630,-2551.262,10.000,26.006},
				{-51756.583,-2527.793,10.000,25.647},
				{-52008.189,-2504.325,10.000,25.273},
				{-52257.448,-2480.857,10.000,24.883},
				{-52504.360,-2457.388,10.000,24.479},
				{-52748.925,-2433.920,10.000,24.061},
				{-52991.144,-2410.452,10.000,23.630},
				{-53231.016,-2386.983,10.000,23.187},
				{-53468.541,-2363.515,10.000,22.733},
				{-53703.719,-2340.047,10.000,22.269},
				{-53936.550,-2316.578,10.000,21.796},
				{-54167.034,-2293.110,10.000,21.315},
				{-54395.172,-2269.641,10.000,20.826},
				{-54620.963,-2246.173,10.000,20.331},
				{-54844.407,-2222.705,10.000,19.831},
				{-55065.504,-2199.236,10.000,19.326},
				{-55284.254,-2175.768,10.000,18.817},
				{-55500.657,-2152.300,10.000,18.306},
				{-55714.714,-2128.831,10.000,17.793},
				{-55926.423,-2105.363,10.000,17.279},
				{-56135.786,-2081.895,10.000,16.765},
				{-56342.802,-2058.426,10.000,16.252},
				{-56547.472,-2034.958,10.000,15.741},
				{-56749.794,-2011.490,10.000,15.232},
				{-56949.770,-1988.021,10.000,14.726},
				{-57147.398,-1964.553,10.000,14.225},
				{-57342.680,-1941.085,10.000,13.728},
				{-57535.615,-1917.616,10.000,13.236},
				{-57726.203,-1894.148,10.000,12.750},
				{-57914.445,-1870.679,10.000,12.271},
				{-58100.339,-1847.211,10.000,11.799},
				{-58283.887,-1823.743,10.000,11.334},
				{-58465.088,-1800.274,10.000,10.877},
				{-58643.942,-1776.806,10.000,10.429},
				{-58820.449,-1753.338,10.000,9.990},
				{-58994.609,-1729.869,10.000,9.561},
				{-59166.423,-1706.401,10.000,9.140},
				{-59335.890,-1682.933,10.000,8.730},
				{-59503.009,-1659.464,10.000,8.330},
				{-59667.782,-1635.996,10.000,7.940},
				{-59830.209,-1612.528,10.000,7.560},
				{-59990.288,-1589.059,10.000,7.192},
				{-60148.020,-1565.591,10.000,6.834},
				{-60303.406,-1542.123,10.000,6.486},
				{-60456.445,-1518.654,10.000,6.150},
				{-60607.137,-1495.186,10.000,5.825},
				{-60755.482,-1471.718,10.000,5.510},
				{-60901.480,-1448.249,10.000,5.207},
				{-61045.132,-1424.781,10.000,4.914},
				{-61186.437,-1401.312,10.000,4.633},
				{-61325.394,-1377.844,10.000,4.361},
				{-61462.005,-1354.376,10.000,4.101},
				{-61596.270,-1330.907,10.000,3.851},
				{-61728.187,-1307.439,10.000,3.611},
				{-61857.757,-1283.971,10.000,3.382},
				{-61984.981,-1260.502,10.000,3.162},
				{-62109.858,-1237.034,10.000,2.953},
				{-62232.388,-1213.566,10.000,2.753},
				{-62352.571,-1190.097,10.000,2.563},
				{-62470.407,-1166.629,10.000,2.382},
				{-62585.897,-1143.161,10.000,2.209},
				{-62699.039,-1119.692,10.000,2.046},
				{-62809.835,-1096.224,10.000,1.892},
				{-62918.284,-1072.756,10.000,1.746},
				{-63024.386,-1049.287,10.000,1.607},
				{-63128.142,-1025.819,10.000,1.477},
				{-63229.550,-1002.350,10.000,1.355},
				{-63328.612,-978.882,10.000,1.240},
				{-63425.327,-955.414,10.000,1.132},
				{-63519.695,-931.945,10.000,1.031},
				{-63611.716,-908.477,10.000,0.936},
				{-63701.390,-885.009,10.000,0.848},
				{-63788.717,-861.540,10.000,0.766},
				{-63873.698,-838.072,10.000,0.690},
				{-63956.332,-814.604,10.000,0.620},
				{-64036.619,-791.135,10.000,0.555},
				{-64114.559,-767.667,10.000,0.495},
				{-64190.152,-744.199,10.000,0.440},
				{-64263.399,-720.730,10.000,0.390},
				{-64334.298,-697.262,10.000,0.343},
				{-64402.851,-673.794,10.000,0.302},
				{-64469.057,-650.325,10.000,0.264},
				{-64532.916,-626.857,10.000,0.229},
				{-64594.428,-603.389,10.000,0.198},
				{-64653.594,-579.920,10.000,0.171},
				{-64710.412,-556.452,10.000,0.146},
				{-64764.884,-532.983,10.000,0.124},
				{-64817.009,-509.515,10.000,0.105},
				{-64866.787,-486.047,10.000,0.088},
				{-64914.218,-462.578,10.000,0.073},
				{-64959.303,-439.110,10.000,0.060},
				{-65002.040,-415.642,10.000,0.049},
				{-65042.431,-392.173,10.000,0.039},
				{-65080.475,-368.705,10.000,0.031},
				{-65116.172,-345.237,10.000,0.025},
				{-65149.522,-321.768,10.000,0.019},
				{-65180.526,-298.300,10.000,0.015},
				{-65209.182,-274.832,10.000,0.011},
				{-65235.492,-251.363,10.000,0.008},
				{-65259.455,-227.895,10.000,0.006},
				{-65281.071,-204.427,10.000,0.004},
				{-65300.340,-180.958,10.000,0.003},
				{-65317.321,-158.648,10.000,0.002},
				{-65332.143,-137.804,10.000,0.001},
				{-65344.955,-118.426,10.000,0.001},
				{-65355.902,-100.516,10.000,0.000},
				{-65365.131,-84.073,10.000,0.000},
				{-65372.790,-69.096,10.000,0.000},
				{-65379.024,-55.586,10.000,0.000},
				{-65383.980,-43.542,10.000,0.000},
				{-65387.805,-32.966,10.000,0.000},
				{-65390.647,-23.856,10.000,0.000},
				{-65392.650,-16.213,10.000,0.000},
				{-65393.963,-10.037,10.000,0.000},
				{-65394.731,-5.328,10.000,0.000},
				{-65395.101,-2.085,10.000,0.000},
				{-65395.221,-0.309,10.000,0.000},
				{-65395.237,-0.000,10.000,0.000},
				{-65395.237,-0.000,10.000,0.000}		};

}