# ZonePatternGenerator

Type: class | Package: com.hypixel.hytale.server.worldgen.zone

public class ZonePatternGenerator

## Fields

- protected final IPointGenerator pointGenerator
- protected final Zone[] zones
- protected final Zone.Unique[] uniqueZones
- protected final MaskProvider maskProvider
- protected final ZoneColorMapping zoneColorMapping

## Constructors

- public ZonePatternGenerator(IPointGenerator pointGenerator, Zone[] zones, Zone.Unique[] uniqueZones, MaskProvider maskProvider, ZoneColorMapping zoneColorMapping)

## Methods

- public Zone[] getZones()
- public Zone.Unique[] getUniqueZones()
- @Nonnull public ZoneGeneratorResult generate(int seed, double x, double z)
- @Nonnull public ZoneGeneratorResult generate(int seed, double x, double z, @Nonnull ZoneGeneratorResult result)
- protected void getZone(int seed, double x, double z, @Nonnull ZoneGeneratorResult result, @Nonnull Zone[] zoneArr)
- @Nonnull @Override public String toString()
