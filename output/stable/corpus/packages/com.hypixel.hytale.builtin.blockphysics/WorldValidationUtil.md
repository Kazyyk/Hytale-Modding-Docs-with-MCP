# WorldValidationUtil

Type: class | Package: com.hypixel.hytale.builtin.blockphysics

public class WorldValidationUtil

Provides block validation consumers for checking unknown block types and components during world/prefab validation.

## Key Methods

- public static IPrefabBuffer.RawBlockConsumer<Void> blockValidator(@Nonnull StringBuilder sb, @Nonnull Set<ValidationOption> options)
- public static IPrefabBuffer.RawBlockConsumer<Void> blockValidator(int offsetX, int offsetY, int offsetZ, @Nonnull StringBuilder sb, @Nonnull Set<ValidationOption> options)

Also in this package: BlockPhysicsPlugin, BlockPhysicsSystems, BlockPhysicsUtil, CachedAccessor, PrefabBufferValidator, Result, Ticking, ValidateBlockEvent

Complete API:
  public static IPrefabBuffer.RawBlockConsumer<Void> blockValidator(StringBuilder sb, Set<ValidationOption> options)
  public static IPrefabBuffer.RawBlockConsumer<Void> blockValidator(int offsetX, int offsetY, int offsetZ, StringBuilder sb, Set<ValidationOption> options)
