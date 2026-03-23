---
title: "Priority"
kind: "enum"
package: "com.hypixel.hytale.codec.lookup"
fqcn: "com.hypixel.hytale.codec.lookup.Priority"
api_surface: true
extends: "java.lang.Enum<Priority>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "codec"
  - "lookup"
  - "serialization"
---

**Package:** `com.hypixel.hytale.codec.lookup`

```java
public enum Priority
```

Priority levels for codec registration in `ACodecMapCodec`. When multiple codecs can handle a document (e.g., with `allowDefault`), they are tried in priority order. Higher priority values are tried first.
