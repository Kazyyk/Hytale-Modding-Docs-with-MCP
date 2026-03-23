# ContextDependency

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.conveyor.stagedconveyor

public class ContextDependency

## Fields

- public static ContextDependency EMPTY
- private final Vector3i readRange
- private final Vector3i writeRange
- private Vector3i trashRange
- private Vector3i externalDependencyRange
- private Vector3i positioningRange

## Methods

- @Nonnull public Bounds3i getReadBounds_voxelGrid()
- @Nonnull public Bounds3i getWriteBounds_voxelGrid()
- private void update()
- @Nonnull public ContextDependency stackOver(ContextDependency other)
- @Nonnull public Vector3i getReadRange()
- @Nonnull public Vector3i getWriteRange()
- @Nonnull public Vector3i getTrashRange()
- @Nonnull public Vector3i getExternalDependencyRange()
- @Nonnull public Vector3i getPositioningRange()
- @Nonnull public static Vector3i getRequiredPadOf(List<ContextDependency> dependencies)
- @Nonnull public static Map<Integer,ContextDependency> cloneMap(Map<Integer,ContextDependency> map)
- @Nonnull public static Map<Integer,ContextDependency> stackMaps(Map<Integer,ContextDependency> under, Map<Integer,ContextDependency> over)
- @Nonnull public static ContextDependency mostOf(List<ContextDependency> dependencies)
- @Nonnull public static ContextDependency mostOf(ContextDependency a, ContextDependency b)
- @Nonnull public static ContextDependency from(Bounds3i readBounds, Bounds3i writeBounds)
- @Nonnull private static Vector3i rangeFromBounds(Bounds3i readBounds)
- @Nonnull public ContextDependency clone()
