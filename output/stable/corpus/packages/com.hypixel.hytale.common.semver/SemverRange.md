# SemverRange

Type: class | Package: com.hypixel.hytale.common.semver | Implements: SemverSatisfies

public class SemverRange implements SemverSatisfies

Implements `SemverSatisfies` to provide SemverRange functionality.

## Constants

- public static final Codec<SemverRange> CODEC
- public static final SemverRange WILDCARD

## Fields

- private final SemverSatisfies[] comparators
- private final boolean and

## Methods

- public SemverRange(SemverSatisfies[] comparators, boolean and)
- @Override public boolean satisfies(Semver semver)
- @Override public String toString()
- @Nonnull public static SemverRange fromString(String str)
- @Nonnull public static SemverRange fromString(String str, boolean strict)

Also in this package: ComparisonType, Semver, SemverComparator, SemverSatisfies

Complete API:
  public boolean satisfies(Semver semver)
  public String toString()
  public static SemverRange fromString(String str)
  public static SemverRange fromString(String str, boolean strict)

Fields:
public static final Codec<SemverRange> CODEC
public static final SemverRange WILDCARD
private final SemverSatisfies[] comparators
private final boolean and
