# MaskProvider

Type: class | Package: com.hypixel.hytale.server.worldgen.chunk | Extends: null

public class MaskProvider

## Fields

- protected final FuzzyZoom fuzzyZoom

## Constructors

- public MaskProvider(FuzzyZoom fuzzyZoom)

## Methods

- public double getX(int seed, double x, double y)
- public double getY(int seed, double x, double y)
- public int get(int seed, double x, double y)
- public double distance(double x, double y)
- public boolean inBounds(double x, double y)
- public FuzzyZoom getFuzzyZoom()
- public Zone.UniqueCandidate[] generateUniqueZoneCandidates(Zone.UniqueEntry[] entries, int maxPositions)
- public MaskProvider generateUniqueZones(int seed, Zone.UniqueCandidate[] candidates, FastRandom random, List<Zone.Unique> zones)
- public String toString()
