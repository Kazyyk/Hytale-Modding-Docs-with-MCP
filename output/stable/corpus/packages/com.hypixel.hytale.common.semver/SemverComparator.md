# SemverComparator

Type: class | Package: com.hypixel.hytale.common.semver | Implements: SemverSatisfies

public class SemverComparator implements SemverSatisfies

Implements `SemverSatisfies` to provide SemverComparator functionality.

## Fields

- private final SemverComparator.ComparisonType comparisonType
- private final Semver compareTo

## Methods

- public SemverComparator(SemverComparator.ComparisonType comparisonType, Semver compareTo)
- @Override public boolean satisfies(Semver semver)
- @Nonnull @Override public String toString()
- @Nonnull public static SemverComparator fromString(String str)
