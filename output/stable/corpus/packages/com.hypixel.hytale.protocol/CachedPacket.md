# CachedPacket

Type: final class | Package: com.hypixel.hytale.protocol | Implements: ToClientPacket, AutoCloseable

public final class CachedPacket<T extends ToClientPacket> implements ToClientPacket, AutoCloseable

Wraps a `ToClientPacket` by pre-serializing its bytes into a Netty `ByteBuf` for efficient repeated transmission. This avoids re-serializing the same packet data when sending to multiple clients. Uses Netty reference counting for memory management -- the cached buffer must be released via `close()` when no longer needed.

## Factory Method


public static <T extends ToClientPacket> CachedPacket<T> cache(@Nonnull T packet)

Creates a new `CachedPacket` by serializing the given packet into a buffer. Throws `IllegalArgumentException` if the input is already a `CachedPacket` (nesting is not allowed).

## Methods


@Override
public int getId()

Returns the packet ID of the wrapped packet.


@Override
public NetworkChannel getChannel()

Returns the network channel of the wrapped packet.


@Override
public void serialize(@Nonnull ByteBuf buf)

Writes the pre-serialized bytes into the given buffer. Throws `IllegalStateException` if the cached buffer has already been released.


@Override
public int computeSize()

Returns the size of the cached serialized data in bytes.


public Class<T> getPacketType()

Returns the `Class` object for the wrapped packet type.


public int getCachedSize()

Returns the number of readable bytes in the cached buffer.


@Override
public void close()

Releases the underlying Netty `ByteBuf`. After calling `close()`, the `CachedPacket` must not be used for serialization.

## Usage Pattern


// Pre-serialize a packet once
CachedPacket<MyPacket> cached = CachedPacket.cache(myPacket);
try {
    // Send to multiple clients without re-serialization
    for (Connection conn : connections) {
        conn.send(cached);
    }
} finally {
    cached.close(); // Release the buffer
}

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static CachedPacket<T> cache(T packet)
  public int getId()
  public NetworkChannel getChannel()
  public void serialize(ByteBuf buf)
  public int computeSize()
  public Class<T> getPacketType()
  public int getCachedSize()
  public void close()

Fields:
private final Class<T> packetType
private final int packetId
private final NetworkChannel packetChannel
private final ByteBuf cachedBytes
