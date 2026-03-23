# ZonePatternProvider

Type: class | Package: com.hypixel.hytale.server.worldgen.zone

public class ZonePatternProvider

## Fields

- protected final IPointGenerator pointGenerator
- protected final Zone[] zones
- protected final Zone.UniqueCandidate[] uniqueZones
- protected final MaskProvider maskProvider
- protected final ZoneColorMapping zoneColorMapping
- protected final int maxExtent

## Constructors

- public ZonePatternProvider(IPointGenerator pointGenerator, Zone[] zones, Zone.UniqueCandidate[] uniqueZones, MaskProvider maskProvider, ZoneColorMapping zoneColorMapping)

## Methods

- public int getMaxExtent()
- public Zone[] getZones()
- public MaskProvider getMaskProvider()
- public ZonePatternGenerator createGenerator(int seed)
- @Override public String toString()
- private static int getMaxExtent(@Nonnull Zone[] zones)
