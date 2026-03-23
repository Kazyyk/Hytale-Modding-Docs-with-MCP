---
title: "BsonTransformationUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.asseteditor.util"
fqcn: "com.hypixel.hytale.builtin.asseteditor.util.BsonTransformationUtil"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "asseteditor"
  - "util"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.asseteditor.util`

```java
public class BsonTransformationUtil
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private static` | `void` | `actionOnProperty(BsonDocument entity, String[] propertyPath, BiConsumer<BsonValue,String> biConsumer, boolean create)` |
| `public static` | `void` | `removeProperty(BsonDocument entity, String[] propertyPath)` |
| `public static` | `void` | `setProperty(BsonDocument entity, String[] pathElements, BsonValue value)` |
| `public static` | `void` | `insertProperty(BsonDocument entity, String[] pathElements, BsonValue value)` |
