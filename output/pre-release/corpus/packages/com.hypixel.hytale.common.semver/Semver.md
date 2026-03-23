# Semver

Type: class | Package: com.hypixel.hytale.common.semver | Implements: Comparable<Semver>

public class Semver implements Comparable<Semver>

Implements `Comparable` to provide Semver functionality.

## Constants

- public static final Codec<Semver> CODEC

## Fields

- private final long major
- private final long minor
- private final long patch
- private final String[] preRelease
- private final String build

## Methods

- public Semver(long major, long minor, long patch)
- public Semver(long major, long minor, long patch, String[] preRelease, String build)
- public long getMajor()
- public long getMinor()
- public long getPatch()
- public String[] getPreRelease()
- public String getBuild()
- public boolean satisfies(@Nonnull SemverRange range)
- public int compareTo(@Nonnull Semver other)
- @Nonnull @Override public String toString()
- @Nonnull public static Semver fromString(String str)
- @Nonnull public static Semver fromString(String str, boolean strict)
- private static void validateBuild(@Nullable String build)
- private static void validatePreRelease(@Nullable String[] preRelease)

Also in this package: ComparisonType, SemverComparator, SemverRange, SemverSatisfies

Complete API:
  public long getMajor()
  public long getMinor()
  public long getPatch()
  public String[] getPreRelease()
  public String getBuild()
  public boolean satisfies(SemverRange range)
  public int compareTo(Semver other)
  public String toString()
  public static Semver fromString(String str)
  public static Semver fromString(String str, boolean strict)
  private static void validateBuild(String build)
  private static void validatePreRelease(String[] preRelease)

Fields:
public static final Codec<Semver> CODEC
private final long major
private final long minor
private final long patch
private final String[] preRelease
private final String build
