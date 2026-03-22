---
title: "ScriptedBrushAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes"
fqcn: "com.hypixel.hytale.builtin.buildertools.scriptedbrushes.ScriptedBrushAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, ScriptedBrushAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "buildertools"
  - "brush"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.scriptedbrushes`

```java
public class ScriptedBrushAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, ScriptedBrushAsset>>
```

JSON-loaded asset representing a scripted brush definition containing an ordered list of `BrushOperation` instances. When loaded into a [BrushConfigCommandExecutor](BrushConfigCommandExecutor.md), operations are separated into sequential and global categories. Supports nested asset loading via `LoadOperationsFromAssetOperation`.

## Static Methods

```java
public static DefaultAssetMap<String, ScriptedBrushAsset> getAssetMap()
```

```java
public static ScriptedBrushAsset get(@Nonnull String id)
```

## Instance Methods

```java
public String getId()
```

```java
public List<BrushOperation> getOperations()
```

```java
public void loadIntoExecutor(@Nonnull BrushConfigCommandExecutor executor)
```

Clears the executor's operations and populates it with this asset's operations, recursively resolving `LoadOperationsFromAssetOperation` references.
