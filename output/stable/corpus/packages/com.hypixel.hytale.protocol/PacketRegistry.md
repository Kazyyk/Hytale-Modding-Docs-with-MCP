# PacketRegistry

Type: final class | Package: com.hypixel.hytale.protocol

public final class PacketRegistry

Static registry of all 268 packet types. Maps packet ID to PacketInfo (id, name, channel, type, fixedBlockSize, maxSize, compressed, validate, deserialize). Provides lookup by ID or class. Inner record PacketInfo and enum PacketDirection (ToServer, ToClient, Both).

## Overview

Static registry of all 268 packet types across 14 sub-packages. Maps packet ID to `PacketInfo` records containing id, name, channel, type, fixed block size, max size, compression flag, validation function, and deserializer.

## Inner Types

### PacketInfo

Record holding metadata for a registered packet: `id`, `name`, `channel`, `type` (class), `fixedBlockSize`, `maxSize`, `compressed`, `validate` (function), `deserialize` (function).

### PacketDirection

Enum with values `ToServer`, `ToClient`, `Both`.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  private static void register(PacketRegistry.PacketDirection direction, NetworkChannel channel, int id, String name, Class<? extends Packet> type, int fixedBlockSize, int maxSize, boolean compressed, BiFunction<ByteBuf,Integer,ValidationResult> validate, BiFunction<ByteBuf,Integer,Packet> deserialize)
  public static PacketRegistry.PacketInfo getToServerPacketById(int id)
  public static PacketRegistry.PacketInfo getToClientPacketById(int id)
  public static Integer getId(Class<? extends Packet> type)
  public static Map<Integer,PacketRegistry.PacketInfo> all()

Fields:
private static final Map<Integer,PacketRegistry.PacketInfo> BY_ID
private static final Map<Integer,PacketRegistry.PacketInfo> TO_SERVER_BY_ID
private static final Map<Integer,PacketRegistry.PacketInfo> TO_CLIENT_BY_ID
private static final Map<Integer,PacketRegistry.PacketInfo> BY_ID_UNMODIFIABLE
private static final Map<Class<? extends Packet>,Integer> BY_TYPE
