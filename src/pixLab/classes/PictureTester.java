package pixLab.classes;

import java.awt.color.*;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Kyle Adams
 */
public class PictureTester {
	/** Method to test zeroBlue */
	public static void testZeroBlue() {
		Picture beach = new Picture("beach.jpg");
		beach.explore();
		beach.zeroBlue();
		beach.explore();
	}

	public static void testWaterBlue() {
		Picture water = new Picture("water.jpg");
		water.explore();
		water.zeroBlue();
		water.explore();
	}



	/** Method to test mirrorVertical */
	public static void testMirrorVertical() {
		Picture caterpillar = new Picture("caterpillar.jpg");
		caterpillar.explore();
		caterpillar.mirrorVertical();
		caterpillar.explore();
	}

	public static void testCopy() {
		Picture copy = new Picture("caterpillar.jpg");
		copy.explore();
		// copy.copy();
		copy.explore();

	}

	/** Method to test mirrorTemple */
	public static void testMirrorTemple() {
		Picture temple = new Picture("arch.jpg");
		temple.explore();
		temple.mirrorTemple();
		temple.explore();
	}

	/** Method to test the collage method */
	public static void testCollage() {
		Picture canvas = new Picture("640x480.jpg");
		canvas.createCollage();
		canvas.explore();
	}

	/** Method to test edgeDetection */
	public static void testEdgeDetection() {
		Picture swan = new Picture("caterpillar.jpg");
		// Picture other = new Picture("barbaraS.jpg");
		swan.edgeDetection(10);
		// swan.copy(other, 30, 10);
		swan.explore();
	}

	public static void testRandomize() {
		Picture randomized = new Picture("barbaraS.jpg");
		randomized.explore();
		randomized.fullRandom();
		randomized.explore();

	}

	public static void glitchArt() {
		Picture glitch = new Picture("barbaraS.jpg");

	}

	public static void testValentinesMeme() {
		Picture ani = new Picture("AnakinSkywalker.png");
		ani.memeIt();
		ani.explore();
	}
	
	public static void testEdgeDetection2()
	{
		Picture swan = new Picture("swan.jpg");
		swan.edgeDetection2(10);
		swan.explore();
	}

	public static void testChosenCopy()
	{
		Picture motorcycle = new Picture ("blueMotorcycle.jpg");
		motorcycle.chosenCopy(motorcycle, 30, 89);
		motorcycle.explore();
	}

	public static void testMirrorGull()
	{
		Picture seagull = new Picture("seagull.jpg");
		seagull.mirrorGull();
		seagull.explore();
	}
	
	public static void testMirrorArms()
	{
		Picture arms = new Picture("Arms.png");
		arms.mirrorVertical();
		arms.explore();
	}
	
	public static void testFiveFilterPhoto()
	{
		Picture Anakin = new Picture("AnakinSkywalker.png");
		Anakin.createCollage();
		Anakin.edgeDetection2(10);
		
		Anakin.zeroBlue();
		
		Anakin.mirrorVertical();
		Anakin.chosenCopy(Anakin, 10, 200);
		
		Anakin.explore();
		
	}
	/**
	 * Main method for testing. Every class can have a main method in Java
	 */
	public static void main(String[] args) {
		// uncomment a call here to run a test
		// and comment out the ones you don't want
		// to run
		// testZeroBlue();
		// testKeepOnlyBlue();
		// testKeepOnlyRed();
		// testRandomize();
		// testKeepOnlyGreen();
		// testNegate();
		// testGrayscale();
		// testFixUnderwater();
		// testMirrorVertical();
		// testMirrorTemple();
		// testWaterBlue();
		// testMirrorArms();
		 		//testMirrorGull();
		//testMirrorDiagonal();
		 		//testCollage();
		 		//testChosenCopy();
		 		//testMirrorArms();
		 testFiveFilterPhoto();
		// testEdgeDetection();
		 		//testEdgeDetection2();
		// testChromakey();
		// testEncodeAndDecode();
		// testGetCountRedOverValue(250);
		// testSetRedToHalfValueInTopHalf();
		// testClearBlueOverValue(200);
		// testGetAverageForColumn(0);
		// testValentinesMeme();
	}
}