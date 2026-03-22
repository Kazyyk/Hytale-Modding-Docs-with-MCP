---
title: "QUICTransport"
kind: "class"
package: "com.hypixel.hytale.server.core.io.transport"
fqcn: "com.hypixel.hytale.server.core.io.transport.QUICTransport"
api_surface: false
extends: ~
implements: ["Transport"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "transport"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.transport`

```java
public class QUICTransport implements Transport
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AttributeKey<X509Certificate>` | `CLIENT_CERTIFICATE_ATTR` |
| `public static final` | `AttributeKey<Integer>` | `ALPN_REJECT_ERROR_CODE_ATTR` |
| `public static final` | `AttributeKey<String>` | `SNI_HOSTNAME_ATTR` |
| `private final` | `EventLoopGroup` | `workerGroup` |
| `private final` | `Bootstrap` | `bootstrapIpv4` |
| `private final` | `Bootstrap` | `bootstrapIpv6` |
| `private final` | `QuicSslContext` | `sslContext` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `TransportType` | `getType()` |
| `@Override public` | `ChannelFuture` | `bind(@Nonnull InetSocketAddress address)` |
| `@Override public` | `void` | `shutdown()` |
| `public` | `boolean` | `isSharable()` |
| `public` | `void` | `channelActive(@Nonnull ChannelHandlerContext ctx)` |
| `public` | `void` | `userEventTriggered(ChannelHandlerContext ctx, Object evt)` |
| `private` | `int` | `parseProtocolVersion(String alpn)` |
| `public` | `void` | `channelInactive(@Nonnull ChannelHandlerContext ctx)` |
| `public` | `void` | `exceptionCaught(@Nonnull ChannelHandlerContext ctx, Throwable cause)` |
| `@Nullable private` | `X509Certificate` | `extractClientCertificate(QuicChannel channel)` |

## Inner Types

- `QUICTransport.QuicChannelInboundHandlerAdapter`
