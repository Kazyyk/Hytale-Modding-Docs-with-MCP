---
title: "InstanceValidator"
kind: "class"
package: "com.hypixel.hytale.builtin.instances"
fqcn: "com.hypixel.hytale.builtin.instances.InstanceValidator"
api_surface: false
extends: ~
implements: ["Validator<String>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "instances"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances`

```java
public class InstanceValidator implements Validator<String>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `InstanceValidator` | `INSTANCE` |
| `public static final` | `String` | `CUSTOM_ASSET_NAME` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `accept(@Nonnull String s, @Nonnull ValidationResults results)` |
| `@Override public` | `void` | `updateSchema(SchemaContext context, @Nonnull Schema target)` |
