# ExactZoom

Type: class | Package: com.hypixel.hytale.server.worldgen.zoom

public class ExactZoom

## Fields

- private final PixelProvider source
- private final PixelDistanceProvider distanceProvider
- private final double zoomX
- private final double zoomY
- private final int offsetX
- private final int offsetY

## Methods

- @Nonnull public PixelDistanceProvider getDistanceProvider()
- public boolean inBounds(double x, double y)
- public int generate(double x, double y)
- public double distanceToNextPixel(double x, double y)
- public ExactZoom generateUniqueZones(Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> zones)
- public Zone.UniqueCandidate[] generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)
- @Nullable private static Vector2i selectCandidatePosition(Zone.UniqueCandidate candidate, PixelProvider source, FastRandom random)
- private static boolean testZoneFit(Zone.UniqueEntry entry, PixelProvider source, int x, int y, int radius)
- public BufferedImage exportImage()
- @Override @Nonnull public String toString()
