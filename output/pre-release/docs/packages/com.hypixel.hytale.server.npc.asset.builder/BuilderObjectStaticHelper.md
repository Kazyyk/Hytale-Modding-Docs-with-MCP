---
title: "BuilderObjectStaticHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.BuilderObjectStaticHelper"
api_surface: false
extends: "BuilderObjectReferenceHelper<T>"
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
public class BuilderObjectStaticHelper<T> extends BuilderObjectReferenceHelper<T>
```

A reference helper variant that enforces that the resolved builder is inline (static). Throws `IllegalStateException` if the JSON contains a `"Reference"` or `"Local"` reference. Used in contexts where dynamic resolution is not supported and the builder must be fully defined in-place.

## Methods

### readConfig

```java
@Override
public void readConfig(@Nonnull JsonElement data, @Nonnull BuilderManager builderManager, @Nonnull BuilderParameters builderParameters, @Nonnull BuilderValidationHelper builderValidationHelper)
```

Delegates to parent, then asserts the result is a final (inline) builder.

### setInternalReference / setFileReference

Both throw `IllegalStateException` -- references are not permitted.

### staticBuild

```java
@Nullable
public T staticBuild(@Nonnull BuilderManager manager)
```

Builds the inline builder with a `null` [BuilderSupport](BuilderSupport.md), passing only the manager. Used for static initialization that does not require entity context.

## Related Types

- [BuilderObjectReferenceHelper](BuilderObjectReferenceHelper.md) -- parent class
- [BuilderObjectStaticListHelper](BuilderObjectStaticListHelper.md) -- uses this for list elements
