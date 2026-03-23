# GapPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class GapPattern extends Pattern

## Fields

- private List<List<GapPattern.PositionedPattern>> axisPositionedPatterns
- private List<GapPattern.PositionedPattern> depthPositionedPatterns
- private double gapSize
- private double anchorSize
- private double anchorRoughness
- private int depthDown
- private int depthUp
- private Pattern gapPattern
- private Pattern anchorPattern
- private SpaceSize readSpaceSize
- private final Vector3i rChildPosition
- private final Pattern.Context rChildContext
- List<GapPattern.PositionedPattern> positions
- Vector3i min
- Vector3i max
- boolean matchesDirection
- ArrayList<GapPattern.PositionedPattern> positions
- Vector3i pointer
- int stepsDown
- int stepsUp
- ArrayList<GapPattern.PositionedPattern> uniquePositions
- HashSet<Vector3i> positionsSet
- double halfGap
- double halfWall
- Vector3d pointer
- Vector3d mov
- double stepSize
- int steps
- Vector3d anchor
- Vector3d wallTip
- private Vector3i position
- private Pattern pattern

## Constructors

- public GapPattern(@Nonnull List<Float> angles,
        double gapSize,
        double anchorSize,
        double anchorRoughness,
        int depthDown,
        int depthUp,
        @Nonnull Pattern gapPattern,
        @Nonnull Pattern anchorPattern)` |

## Methods

- throw new IllegalArgumentException("negative sizes")
- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()
- private List<GapPattern.PositionedPattern> renderDepths()
- private List<GapPattern.PositionedPattern> renderPositions(float angle)
- private List<GapPattern.PositionedPattern> renderHalfPositions(float angle)
- public PositionedPattern(@Nonnull Pattern pattern, @Nonnull Vector3i position)
- public int getX()
- public int getY()
- public int getZ()
- public Pattern getPattern()
- protected GapPattern.PositionedPattern clone()

## Inner Types

- `GapPattern.PositionedPattern`

## Related Types

- Pattern
