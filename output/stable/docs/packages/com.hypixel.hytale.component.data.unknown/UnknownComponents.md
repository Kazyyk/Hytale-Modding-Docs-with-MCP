---
title: "UnknownComponents"
kind: "class"
package: "com.hypixel.hytale.component.data.unknown"
fqcn: "com.hypixel.hytale.component.data.unknown.UnknownComponents"
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
public class UnknownComponents<ECS_TYPE> implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `HytaleLogger` | `LOGGER` |
| `public static final` | `String` | `ID` |
| `public static final` | `BuilderCodec<UnknownComponents>` | `CODEC` |
| `private` | `Map<String,BsonDocument>` | `unknownComponents` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `addComponent(String componentId, Component<ECS_TYPE> component, Codec<Component<ECS_TYPE>> codec)` |
| `public` | `void` | `addComponent(String componentId, TempUnknownComponent<ECS_TYPE> component)` |
| `public` | `boolean` | `contains(String componentId)` |
| `@Nullable public` | `T` | `removeComponent(String componentId, Codec<T> codec)` |
| `@Nonnull public` | `Map<String,BsonDocument>` | `getUnknownComponents()` |
| `@Nonnull @Override public` | `Component<ECS_TYPE>` | `clone()` |
