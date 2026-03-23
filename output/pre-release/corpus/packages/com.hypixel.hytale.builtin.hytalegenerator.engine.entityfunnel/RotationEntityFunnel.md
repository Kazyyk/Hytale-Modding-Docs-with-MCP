# RotationEntityFunnel

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel | Implements: EntityFunnel

public class RotationEntityFunnel implements EntityFunnel

An EntityFunnel decorator that applies a rotation transform to entity placement data before delegating to a source funnel. Rotates both the entity offset position and the entity's transform (position and rotation) around an anchor point using a `RotationTuple`. The view bounds are the inverse rotation of the source's bounds.

## Fields

- @Nonnull private final RotationTuple rotation_fromViewToSource
- @Nonnull private Bounds3i viewBounds
- @Nonnull private EntityFunnel source
- @Nonnull private final Vector3i anchor

## Constructors

- public RotationEntityFunnel(@Nonnull RotationTuple rotation)

## Methods

- public void setSource(@Nonnull EntityFunnel source, @Nonnull Vector3i anchor)
- @Override public void addEntity(@Nonnull EntityPlacementData entityPlacementData)
- @Override public Bounds3i getBounds()
