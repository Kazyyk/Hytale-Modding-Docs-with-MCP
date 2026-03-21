---
title: "WorldSomnolence"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.resources"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.resources.WorldSomnolence"
api_surface: false
extends: null
implements: ["Resource"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "beds"
  - "sleep"
  - "resources"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.resources`

```java
public class WorldSomnolence implements Resource
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `WorldSleep` | `state` |
| `private` | `long` | `lastSleepNotification` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ResourceType<EntityStore,WorldSomnolence>` | `getResourceType()` |
| `@Nonnull public` | `WorldSleep` | `getState()` |
| `public` | `void` | `setState(WorldSleep state)` |
| `public` | `boolean` | `useSleepNotificationCooldown(long now, long cooldownMs)` |
| `public` | `void` | `resetNotificationCooldown()` |
| `@Nullable @Override public` | `Resource<EntityStore>` | `clone()` |
