# ZoneDiscoveryConfig

Type: record | Package: com.hypixel.hytale.server.worldgen.zone

public record ZoneDiscoveryConfig( boolean display, String zone, @Nullable String soundEventId, @Nullable String icon, boolean major, float duration, float fadeInDuration, float fadeOutDuration )

## Record Components

- boolean display
- String zone
- String soundEventId
- String icon
- boolean major
- float duration
- float fadeInDuration
- float fadeOutDuration

## Fields

- @Nonnull public static final ZoneDiscoveryConfig DEFAULT

## Methods

- @Nonnull public static ZoneDiscoveryConfig of(@Nullable Boolean display,
        @Nullable String zone,
        @Nullable String soundEventId,
        @Nullable String icon,
        @Nullable Boolean major,
        @Nullable Float duration,
        @Nullable Float fadeInDuration,
        @Nullable Float fadeOutDuration)` |

Also in this package: Unique, UniqueCandidate, UniqueEntry, Zone, ZoneColorMapping, ZoneGeneratorResult, ZonePatternGenerator, ZonePatternGeneratorCache, ZonePatternProvider

Complete API:
  public static ZoneDiscoveryConfig of(Boolean display, String zone, String soundEventId, String icon, Boolean major, Float duration, Float fadeInDuration, Float fadeOutDuration)

Fields:
public static final ZoneDiscoveryConfig DEFAULT
