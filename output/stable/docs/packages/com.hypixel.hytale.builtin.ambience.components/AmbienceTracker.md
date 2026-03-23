---
title: "AmbienceTracker"
kind: "class"
package: "com.hypixel.hytale.builtin.ambience.components"
fqcn: "com.hypixel.hytale.builtin.ambience.components.AmbienceTracker"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "ambience"
  - "components"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.ambience.components`

```java
public class AmbienceTracker implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UpdateEnvironmentMusic` | `musicPacket` |
| `private` | `int` | `forcedMusicIndex` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,AmbienceTracker>` | `getComponentType()` |
| `public` | `void` | `setForcedMusicIndex(int forcedMusicIndex)` |
| `public` | `int` | `getForcedMusicIndex()` |
| `@Nonnull public` | `UpdateEnvironmentMusic` | `getMusicPacket()` |
| `@Nullable @Override public` | `Component<EntityStore>` | `clone()` |
