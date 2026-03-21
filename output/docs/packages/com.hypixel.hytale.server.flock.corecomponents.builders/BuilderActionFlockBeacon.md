---
title: "BuilderActionFlockBeacon"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents.builders"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.builders.BuilderActionFlockBeacon"
api_surface: false
extends: "BuilderActionBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "builders"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents.builders`

```java
public class BuilderActionFlockBeacon extends BuilderActionBase
```

NPC behavior action builder for ActionFlockBeacon functionality.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected final` | `StringHolder` | `message` | `new StringHolder()` |
| `protected` | `String` | `sendTargetSlot` |  |
| `protected` | `double` | `expirationTime` |  |
| `protected` | `boolean` | `sendToSelf` |  |
| `protected` | `boolean` | `sendToLeaderOnly` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `ActionFlockBeacon` | `build(@Nonnull BuilderSupport builderSupport)` |
| `@Nonnull @Override public` | `String` | `getShortDescription()` |
| `@Nonnull @Override public` | `String` | `getLongDescription()` |
| `@Override public` | `void` | `registerTags(@Nonnull Set<String> tags)` |
| `@Nonnull @Override public` | `BuilderDescriptorState` | `getBuilderDescriptorState()` |
| `@Nonnull public` | `BuilderActionFlockBeacon` | `readConfig(@Nonnull JsonElement data)` |
| `public` | `String` | `getMessage(@Nonnull BuilderSupport builderSupport)` |
| `public` | `int` | `getSendTargetSlot(@Nonnull BuilderSupport support)` |
| `public` | `double` | `getExpirationTime()` |
| `public` | `boolean` | `isSendToSelf()` |
| `public` | `boolean` | `isSendToLeaderOnly()` |
