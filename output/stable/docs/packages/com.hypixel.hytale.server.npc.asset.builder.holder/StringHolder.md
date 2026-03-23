---
title: "StringHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.StringHolder"
api_surface: false
extends: "StringHolderBase"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.asset.builder.holder`

```java
public class StringHolder extends StringHolderBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `StringValidator` | `stringValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `validate(ExecutionContext context)` |
| `public` | `void` | `readJSON(@Nonnull JsonElement requiredJsonElement, StringValidator validator, String name, @Nonnull BuilderParameters builderParameters)` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, String defaultValue, StringValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `String` | `get(ExecutionContext executionContext)` |
| `public` | `String` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `validate(String value)` |
