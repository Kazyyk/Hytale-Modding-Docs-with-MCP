# EntityMigration

Type: class | Package: com.hypixel.hytale.server.core.modules.migrations | Implements: Migration

public abstract class EntityMigration<T> implements Migration

Implementation of `Migration`.

## Fields

- tClass | Class<T> | Class<T> field.
- extraInfoSupplier | IntFunction<ExtraInfo> | IntFunction<ExtraInfo> field.

## Constructors

- EntityMigration(Class<T> tClass, IntFunction<ExtraInfo> extraInfoSupplier) | Creates a new EntityMigration instance.

## Methods

- run(WorldChunk chunk) | void | public method.
- migrate(T var1) | boolean | protected method.
