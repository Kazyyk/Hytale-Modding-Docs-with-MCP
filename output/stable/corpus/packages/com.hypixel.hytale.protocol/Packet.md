# Packet

Type: interface | Package: com.hypixel.hytale.protocol

public interface Packet

Core packet interface. Defines getId(), getChannel(), serialize(ByteBuf), computeSize(). All network messages implement this.

## Methods


int getId()


NetworkChannel getChannel()


void serialize(@Nonnull ByteBuf var1)


int computeSize()
