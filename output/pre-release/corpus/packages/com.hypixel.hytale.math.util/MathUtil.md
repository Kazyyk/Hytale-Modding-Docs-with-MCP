# MathUtil

Type: class | Package: com.hypixel.hytale.math.util

public class MathUtil

## Constants

- public static final double EPSILON_DOUBLE
- public static final float EPSILON_FLOAT

## Fields

- public static float PITCH_EDGE_PADDING

Also in this package: ChunkUtil, FastRandom, HashUtil, Icecore, IterationElement, NearestBlockUtil, NumberUtil, Riven, TrigMathUtil

Complete API:
  public static int abs(int i)
  public static int floor(double d)
  public static int ceil(double d)
  public static int randomInt(int min, int max)
  public static double randomDouble(double min, double max)
  public static float randomFloat(float min, float max)
  public static double round(double d, int p)
  public static boolean within(double val, double min, double max)
  public static double minValue(double v, double a, double c)
  public static int minValue(int v, int a, int c)
  public static double maxValue(double v, double a, double b, double c)
  public static double maxValue(double v, double a, double b)
  public static byte maxValue(byte v, byte a, byte b)
  public static byte maxValue(byte v, byte a, byte b, byte c)
  public static int maxValue(int v, int a, int b)
  public static double lengthSquared(double x, double y)
  public static double length(double x, double y)
  public static double lengthSquared(double x, double y, double z)
  public static double length(double x, double y, double z)
  public static double maxValue(double v, double a)
  public static double clipToZero(double v)
  public static double clipToZero(double v, double epsilon)
  public static float clipToZero(float v)
  public static float clipToZero(float v, float epsilon)
  public static boolean closeToZero(double v)
  public static boolean closeToZero(double v, double epsilon)
  public static boolean closeToZero(float v)
  public static boolean closeToZero(float v, float epsilon)
  public static double clamp(double v, double min, double max)
  public static float clamp(float v, float min, float max)
  public static int clamp(int v, int min, int max)
  public static long clamp(long v, long min, long max)
  public static int getPercentageOf(int index, int max)
  public static double percent(int v, int total)
  public static int fastRound(float f)
  public static long fastRound(double d)
  public static int fastFloor(float f)
  public static long fastFloor(double d)
  public static int fastCeil(float f)
  public static long fastCeil(double d)
  public static float halfFloatToFloat(int hbits)
  public static int halfFloatFromFloat(float fval)
  public static int byteCount(int i)
  public static int packInt(int x, int z)
  public static int unpackLeft(int packed)
  public static int unpackRight(int packed)
  public static long packLong(int left, int right)
  public static int unpackLeft(long packed)
  public static int unpackRight(long packed)
  public static Vector3i rotateVectorYAxis(Vector3i vector, int angle, boolean clockwise)
  public static Vector3d rotateVectorYAxis(Vector3d vector, int angle, boolean clockwise)
  public static float wrapAngle(float angle)
  public static float lerp(float a, float b, float t)
  public static float lerpUnclamped(float a, float b, float t)
  public static double lerp(double a, double b, double t)
  public static double lerpUnclamped(double a, double b, double t)
  public static float shortAngleDistance(float a, float b)
  public static float lerpAngle(float a, float b, float t)
  public static double floorMod(double x, double y)
  public static double compareAngle(double a, double b)
  public static double percentile(long[] sortedData, double percentile)
  public static double distanceToLineSq(double x, double y, double ax, double ay, double bx, double by)
  public static double distanceToLineSq(double x, double y, double ax, double ay, double bx, double by, double dxAx, double dyAy, double dBxAx, double dByAy)
  public static double distanceToInfLineSq(double x, double y, double ax, double ay, double bx, double by)
  public static double distanceToInfLineSq(double x, double y, double ax, double ay, double dxAx, double dyAy, double dBxAx, double dByAy)
  public static int sideOfLine(double x, double y, double ax, double ay, double bx, double by)
  public static Vector3f getRotationForHitNormal(Vector3f normal)
  public static String getNameForHitNormal(Vector3f normal)
  public static float mapToRange(float value, float valueMin, float valueMax, float rangeMin, float rangeMax)

Fields:
public static final double EPSILON_DOUBLE
public static final float EPSILON_FLOAT
public static float PITCH_EDGE_PADDING
