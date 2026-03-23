# FuzzyZoom

Type: class | Package: com.hypixel.hytale.server.worldgen.zoom

public class FuzzyZoom

## Fields

- private final ICoordinateRandomizer randomizer
- private final ExactZoom exactZoom

## Methods

- public double getX(int seed, double x, double y)
- public double getY(int seed, double x, double y)
- public int generate(double x, double y)
- public double distance(double x, double y)
- @Nonnull public ExactZoom getExactZoom()
- public boolean inBounds(double x, double y)
- public Zone.UniqueCandidate[] generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)
- public FuzzyZoom generateUniqueZones(Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> zones)
- @Override @Nonnull public String toString()

Also in this package: ExactZoom, IPixelSet, MultiplePixelSet, PixelDistanceProvider, PixelProvider, SinglePixelSet

Complete API:
  public double getX(int seed, double x, double y)
  public double getY(int seed, double x, double y)
  public int generate(double x, double y)
  public double distance(double x, double y)
  public ExactZoom getExactZoom()
  public boolean inBounds(double x, double y)
  public Zone.UniqueCandidate[] generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)
  public FuzzyZoom generateUniqueZones(Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> zones)
  public String toString()

Fields:
private final ICoordinateRandomizer randomizer
private final ExactZoom exactZoom
