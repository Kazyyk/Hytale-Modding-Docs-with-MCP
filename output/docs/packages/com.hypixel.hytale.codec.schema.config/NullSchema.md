---
title: "NullSchema"
kind: "class"
package: "com.hypixel.hytale.codec.schema.config"
fqcn: "com.hypixel.hytale.codec.schema.config.NullSchema"
api_surface: false
extends: "com.hypixel.hytale.codec.schema.config.Schema"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "codec"
  - "schema"
---

**Package:** `com.hypixel.hytale.codec.schema.config`

```java
public class NullSchema extends Schema
```

Schema node for the JSON Schema `"null"` type. No additional fields beyond those inherited from [Schema](Schema.md).

## Static Fields

| Type | Name | Description |
|---|---|---|
| `BuilderCodec<NullSchema>` | `CODEC` | Builder codec extending `Schema.BASE_CODEC`. |
| `NullSchema` | `INSTANCE` | Singleton instance. |

## See Also

- [Schema](Schema.md) -- base class
