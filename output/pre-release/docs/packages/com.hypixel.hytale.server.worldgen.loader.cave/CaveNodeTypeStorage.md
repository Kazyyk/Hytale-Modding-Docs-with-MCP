---
title: "CaveNodeTypeStorage"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.loader.cave"
fqcn: "com.hypixel.hytale.server.worldgen.loader.cave.CaveNodeTypeStorage"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldgen"
  - "cave"
  - "loader"
  - "storage"
---

**Package:** `com.hypixel.hytale.server.worldgen.loader.cave`

```java
public class CaveNodeTypeStorage
```

Registry for loaded `CaveNodeType` instances during cave JSON loading. Caches loaded types by name and supports lazy loading from `.node.json` files. Prevents duplicate registration of the same name.

## Constructors

```java
public CaveNodeTypeStorage(SeedString<SeedStringResource> seed, Path dataFolder, Path caveFolder, ZoneFileContext zoneContext)
```

## Instance Methods

```java
public SeedString<SeedStringResource> getSeed()
```

```java
public void add(String name, CaveNodeType caveNodeType)
```

```java
public CaveNodeType getOrLoadCaveNodeType(@Nonnull String name)
```

Returns the cached type or loads it from a `.node.json` file.

```java
public CaveNodeType getCaveNodeType(String name)
```

```java
public CaveNodeType loadCaveNodeType(@Nonnull String name)
```

```java
public CaveNodeType loadCaveNodeType(@Nonnull String name, @Nonnull JsonObject json)
```
