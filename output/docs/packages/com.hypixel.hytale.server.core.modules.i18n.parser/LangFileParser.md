---
title: "LangFileParser"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.i18n.parser"
fqcn: "com.hypixel.hytale.server.core.modules.i18n.parser.LangFileParser"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "i18n"
  - "parser"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.modules.i18n.parser`

```java
public class LangFileParser
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull private static` | `String` | `literal(String value)` |
| `@Nonnull private static` | `String` | `escape(StringBuilder builder)` |
| `@Nonnull public static` | `Map<String,String>` | `parse(BufferedReader reader) throws IOException, LangFileParser.TranslationParseException` |

## Inner Types

- `LangFileParser.TranslationParseException`
