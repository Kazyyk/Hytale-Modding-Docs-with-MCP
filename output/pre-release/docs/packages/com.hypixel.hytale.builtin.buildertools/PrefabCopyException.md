---
title: "PrefabCopyException"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools"
fqcn: "com.hypixel.hytale.builtin.buildertools.PrefabCopyException"
api_surface: false
extends: "java.lang.Exception"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "buildertools"
  - "creative"
  - "prefab"
  - "exception"
---

**Package:** `com.hypixel.hytale.builtin.buildertools`

```java
public class PrefabCopyException extends Exception
```

Thrown when a prefab copy operation fails. Used within the builder tools system to signal errors during clipboard copy operations involving prefabs.

## Constructor

```java
public PrefabCopyException(String message)
```

Creates a new `PrefabCopyException` with the specified error message. Delegates to `Exception(String)`.

## Related Types

- [BuilderToolsPlugin](BuilderToolsPlugin.md) -- the plugin where prefab copy operations originate
- [BuilderToolsPlugin.BuilderState](BuilderToolsPlugin.BuilderState.md) -- performs copy/cut operations that may throw this exception
