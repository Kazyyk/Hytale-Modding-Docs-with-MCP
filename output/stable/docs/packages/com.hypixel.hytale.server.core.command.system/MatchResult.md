---
title: "MatchResult"
kind: "class"
package: "com.hypixel.hytale.server.core.command.system"
fqcn: "com.hypixel.hytale.server.core.command.system.MatchResult"
api_surface: true
extends: ~
implements: ["java.lang.Comparable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "command"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.command.system`

```java
public class MatchResult
```

Comparable result from fuzzy-matching a search term against command names, aliases, arguments, and descriptions. Used by the help/search system to rank command relevance. Implements `Comparable<MatchResult>`.
