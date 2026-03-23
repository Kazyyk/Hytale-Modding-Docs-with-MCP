---
title: "PluginIdentifier"
kind: "class"
package: "com.hypixel.hytale.common.plugin"
fqcn: "com.hypixel.hytale.common.plugin.PluginIdentifier"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "common"
  - "plugin"
  - "class"
---

**Package:** `com.hypixel.hytale.common.plugin`

```java
public class PluginIdentifier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `String` | `THIRD_PARTY_LOADER_NAME` |
| `private final` | `String` | `group` |
| `private final` | `String` | `name` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public static` | `PluginIdentifier` | `identifyThirdPartyPlugin(Throwable t)` |
| `@Nonnull public` | `String` | `getGroup()` |
| `@Nonnull public` | `String` | `getName()` |
| `@Override public` | `int` | `hashCode()` |
| `@Override public` | `boolean` | `equals(@Nullable Object o)` |
| `@Override @Nonnull public` | `String` | `toString()` |
| `@Nonnull public static` | `PluginIdentifier` | `fromString(@Nonnull String str)` |
