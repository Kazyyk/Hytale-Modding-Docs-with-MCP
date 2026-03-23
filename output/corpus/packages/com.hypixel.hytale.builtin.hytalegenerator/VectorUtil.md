# VectorUtil

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class VectorUtil

Comprehensive vector math utilities including distance calculations, segment intersection, rotation, containment tests, and bit-shift operations.

## Key Methods

- public static boolean areasOverlap(@Nonnull Vector3d minA, @Nonnull Vector3d maxA, @Nonnull Vector3d minB, @Nonnull Vector3d maxB)
- public static double distanceToSegment3d(@Nonnull Vector3d point, @Nonnull Vector3d p0, @Nonnull Vector3d p1)
- public static double distanceToLine3d(@Nonnull Vector3d point, @Nonnull Vector3d p0, @Nonnull Vector3d p1, @Nonnull Vector3d rLineVec, @Nonnull Vector3d rPointVec, @Nonnull Vector3d rLineUnitVec, @Nonnull Vector3d rPointVecScaled, @Nonnull Vector3d rNearestPoint)
- public static Vector3d nearestPointOnSegment3d(@Nonnull Vector3d point, @Nonnull Vector3d p0, @Nonnull Vector3d p1)
- public static void nearestPointOnLine3d(@Nonnull Vector3d point, @Nonnull Vector3d p0, @Nonnull Vector3d p1, @Nonnull Vector3d vector_out, @Nonnull Vector3d rLineVec, @Nonnull Vector3d rPointVec, @Nonnull Vector3d rLineUnitVec, @Nonnull Vector3d rPointVecScaled)
- public static boolean[] shortestSegmentBetweenTwoSegments(@Nonnull Vector3d a0, @Nonnull Vector3d a1, @Nonnull Vector3d b0, @Nonnull Vector3d b1, boolean clamp, @Nonnull Vector3d p0Out, @Nonnull Vector3d p1Out)
- public static double determinant(@Nonnull Vector3d v1, @Nonnull Vector3d v2)
- public static double determinant(@Nonnull Vector3d a, @Nonnull Vector3d b, @Nonnull Vector3d c)
- public static DoubleObjectPair<Vector3d> distanceAndNearestPointOnSegment3d(@Nonnull Vector3d point, @Nonnull Vector3d p0, @Nonnull Vector3d p1)
- public static double angle(@Nonnull Vector3d a, @Nonnull Vector3d b)
- public static void rotateAroundAxis(@Nonnull Vector3d vec, @Nonnull Vector3d axis, double theta)
- public static void rotateVectorByAxisAngle(@Nonnull Vector3d vec, @Nonnull Vector3d axis, double angle)
- public static boolean isInside(@Nonnull Vector3i point, @Nonnull Vector3i min, @Nonnull Vector3i max)
- public static boolean isInside(@Nonnull Vector3d point, @Nonnull Vector3d min, @Nonnull Vector3d max)
- public static boolean isAnySmaller(@Nonnull Vector3d point, @Nonnull Vector3d limit)
- public static boolean isSmaller(@Nonnull Vector3d point, @Nonnull Vector3d limit)
- public static boolean isAnyGreater(@Nonnull Vector3d point, @Nonnull Vector3d limit)
- public static boolean isAnySmaller(@Nonnull Vector3i point, @Nonnull Vector3i limit)
- public static boolean isAnyGreater(@Nonnull Vector3i point, @Nonnull Vector3i limit)
- public static boolean isInside(@Nonnull Vector2d point, @Nonnull Vector2d min, @Nonnull Vector2d max)
- public static boolean isAnySmaller(@Nonnull Vector2d point, @Nonnull Vector2d limit)
- public static boolean isSmaller(@Nonnull Vector2d point, @Nonnull Vector2d limit)
- public static boolean isAnyGreater(@Nonnull Vector2d point, @Nonnull Vector2d limit)
- public static boolean isAnySmaller(@Nonnull Vector2i point, @Nonnull Vector2i limit)
- public static boolean isSmaller(@Nonnull Vector2i point, @Nonnull Vector2i limit)
- public static boolean isAnyGreater(@Nonnull Vector2i point, @Nonnull Vector2i limit)
- public static Vector3i fromOperation(@Nonnull Vector3i v1, @Nonnull Vector3i v2, @Nonnull VectorUtil.BiOperation3i operation)
- public static Vector3i fromOperation(@Nonnull VectorUtil.NakedOperation3i operation)
- public static void bitShiftRight(int shift, @Nonnull Vector3i vector)
- public static void bitShiftLeft(int shift, @Nonnull Vector3i vector)
- public static List<Vector2i> orderByDistanceFrom(@Nonnull Vector2i origin, @Nonnull List<Vector2i> vectors)
- public int getIndex()
- public int from(@Nonnull Vector3i vec)
- public int from(@Nonnull Vector2i vec)
- public double from(@Nonnull Vector3d vec)
- public double from(@Nonnull Vector2d vec)
- public static VectorUtil.Retriever ofIndex(int index)
