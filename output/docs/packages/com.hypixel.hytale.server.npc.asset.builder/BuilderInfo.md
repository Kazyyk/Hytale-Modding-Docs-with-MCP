---
title: "BuilderInfo"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderInfo"
api_surface: false
extends: ~
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class BuilderInfo
```

Metadata about a loaded NPC builder. Tracks the builder's index in the [BuilderManager](BuilderManager.md) cache, its key name, the file path it was loaded from, and its current validation state.

## Inner Types

### State (enum)

```java
protected static enum State
```

| Constant | Description |
|---|---|
| `NEEDS_RELOAD` | The file has changed and the builder must be re-read. |
| `NEEDS_VALIDATION` | The builder has been read but not yet validated. |
| `VALID` | Validation succeeded. |
| `INVALID` | Validation failed. |
| `REMOVED` | The builder has been unloaded. |

## Constructor

```java
public BuilderInfo(int index, String keyName, Builder<?> builder, Path path)
```

Initial state is `NEEDS_VALIDATION`.

## Methods

### getIndex / getKeyName / getBuilder / getPath

```java
public int getIndex()
public String getKeyName()
public Builder<?> getBuilder()
public Path getPath()
```

### isValidated

```java
public boolean isValidated()
```

Returns `true` if the state is `VALID` or `INVALID`.

### isValid

```java
public boolean isValid()
```

Returns `true` only if the state is `VALID`.

### setValidated

```java
public boolean setValidated(boolean success)
```

Sets the state to `VALID` or `INVALID` based on the argument and returns the same boolean.

### setForceValidation / setNeedsValidation / setNeedsReload

```java
public void setForceValidation()
public void setNeedsValidation()
public void setNeedsReload()
```

State transition methods. `setNeedsValidation` and `setNeedsReload` are no-ops if the builder is `REMOVED`.

### canBeValidated

```java
public boolean canBeValidated()
```

Returns `true` if the state is not `NEEDS_RELOAD` or `REMOVED`.

### needsValidation

```java
public boolean needsValidation()
```

Returns `true` if the state is `NEEDS_VALIDATION`.

### setRemoved / isRemoved

```java
public void setRemoved()
public boolean isRemoved()
```

## Related Types

- [BuilderManager](BuilderManager.md) -- owns the builder cache containing these info objects
- [Builder](Builder.md) -- the builder instance stored in this info
