# PixelDistanceProvider

Type: class | Package: com.hypixel.hytale.server.worldgen.zoom

public class PixelDistanceProvider

## Fields

- private static final int TABLE_SIZE
- protected final PixelProvider image
- protected final int width
- protected final int height
- protected final int cellsX
- protected final int cellsY
- protected final PixelDistanceProvider.IPixelSet[] table
- protected final IntSet pixels
- private final IntSet pixels
- private final int pixel

## Methods

- @Nonnull public IntSet getColors()
- public double distanceSqToDifferentPixel(double ox, double oy, int px, int py)
- protected double distanceSqToDiffInSeq(double ox, double oy, int pixel, int cellX, int cellY)
- protected boolean hasDifferentPixel(int cellX, int cellY, int pixel)
- private void prepareSegmentTable()
- protected int clampX(int x)
- protected int clampY(int y)
- protected int cellIndex(int cellX, int cellY)
- private static double distanceSqToPixel(double ox, double oy, int px, int py)
- @Override public boolean contains(int pixel)
- @Override public int size()
- @Override @Nonnull public String toString()

## Inner Types

- `PixelDistanceProvider.IPixelSet`
- `PixelDistanceProvider.MultiplePixelSet`
- `PixelDistanceProvider.SinglePixelSet`
