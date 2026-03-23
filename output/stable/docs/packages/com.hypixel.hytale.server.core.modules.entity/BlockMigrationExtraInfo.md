---
title: "BlockMigrationExtraInfo"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.BlockMigrationExtraInfo"
api_surface: false
extends: "ExtraInfo"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class BlockMigrationExtraInfo extends ExtraInfo
```

Carries block migration context during codec deserialization. Extends `ExtraInfo` (which provides a version number) with a string-to-string remapping function that translates old block type identifiers to their current equivalents. Used during data migration when loading entities that reference block types from older save formats.

## Constructor

```java
public BlockMigrationExtraInfo(int version, Function<String, String> blockMigration)
```

Constructs a migration info with the specified data version and block identifier remapping function.

## Methods

```java
public Function<String, String> getBlockMigration()
```

Returns the block identifier migration function. Given an old block type key, returns the corresponding current key.

## Related Types

- `ExtraInfo` -- base class providing the version field
- [EntityModule](EntityModule.md) -- the module that manages entity serialization/deserialization
- [BlockEntitySystems](BlockEntitySystems.md) -- systems that process block entities which may require migration
