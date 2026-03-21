---
title: "TempUnknownComponent"
kind: "class"
package: "com.hypixel.hytale.component.data.unknown"
fqcn: "com.hypixel.hytale.component.data.unknown.TempUnknownComponent"
api_surface: true
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "data"
  - "unknown"
  - "class"
---

**Package:** `com.hypixel.hytale.component.data.unknown`

```java
public class TempUnknownComponent<ECS_TYPE> implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Codec<Component>` | `COMPONENT_CODEC` |
| `private final` | `BsonDocument` | `document` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `BsonDocument` | `getDocument()` |
| `@Nonnull @Override public` | `Component<ECS_TYPE>` | `clone()` |
