# EntityTransformSnapshot

Type: class | Package: com.hypixel.hytale.builtin.buildertools.snapshot | Implements: EntitySnapshot<EntityTransformSnapshot>

public class EntityTransformSnapshot implements EntitySnapshot<EntityTransformSnapshot>

Immutable snapshot capturing state for undo/redo in the builder tools system.

## Fields

- ref | Ref<EntityStore> | final Ref<EntityStore> field.
- transform | Transform | final Transform field.
- headRotation | Vector3f | final Vector3f field.

## Constructors

- EntityTransformSnapshot(@Nonnull Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | Creates a new EntityTransformSnapshot instance.

## Methods

- restoreEntity(@Nonnull Player player, @Nonnull World world, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | EntityTransformSnapshot | public method.
