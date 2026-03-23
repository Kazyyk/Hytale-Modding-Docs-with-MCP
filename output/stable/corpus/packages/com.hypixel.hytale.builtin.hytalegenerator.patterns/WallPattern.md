# WallPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class WallPattern extends Pattern

## Fields

- private final Pattern wallPattern
- private final Pattern originPattern
- private final List<WallPattern.WallDirection> directions
- private final boolean matchAll
- private final SpaceSize readSpaceSize
- private final Vector3i rWallPosition
- private final Pattern.Context rWallContext
- SpaceSize originSpace
- SpaceSize wallSpace
- SpaceSize totalSpace
- SpaceSize directionedWallSpace
- boolean matches
- N, 
        S,
        E,` | `W` |
| `` | `public static final Codec<WallPattern.WallDirection>` | `CODEC` |

## Constructors

- public WallPattern(@Nonnull Pattern wallPattern, @Nonnull Pattern originPattern, @Nonnull List<WallPattern.WallDirection> wallDirections, boolean matchAll)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- private boolean matches(@Nonnull Pattern.Context context, @Nonnull WallPattern.WallDirection direction)
- public SpaceSize readSpace()

## Inner Types

- `WallPattern.WallDirection`

## Related Types

- Pattern

Also in this package: AndPattern, CeilingPattern, Context, CuboidPattern, Delimiter, Facing, FieldFunctionPattern, GapPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, PositionedPattern, SurfacePattern, WallDirection

Complete API:
  public boolean matches(Pattern.Context context)
  private boolean matches(Pattern.Context context, WallPattern.WallDirection direction)
  public SpaceSize readSpace()

Fields:
private final Pattern wallPattern
private final Pattern originPattern
private final List<WallPattern.WallDirection> directions
private final boolean matchAll
private final SpaceSize readSpaceSize
private final Vector3i rWallPosition
private final Pattern.Context rWallContext
