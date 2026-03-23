# EntityFunnel

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.entityfunnel

public interface EntityFunnel

Defines the contract for receiving entity placement data during world generation. Provides a no-op `NULL` instance with zero-volume bounds. Implementations include `EntityBufferView` and RotationEntityFunnel.

## Fields

- static EntityFunnel NULL

## Methods

- void addEntity(@Nonnull EntityPlacementData var1)
- @Nonnull Bounds3i getBounds()

Known implementors: EntityBufferView, RotationEntityFunnel

Also in this package: RotationEntityFunnel

Complete API:
  void addEntity(EntityPlacementData var1)
  Bounds3i getBounds()

Fields:
EntityFunnel NULL
