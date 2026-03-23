# PlayerAuthentication

Type: class | Package: com.hypixel.hytale.server.core.auth

public class PlayerAuthentication

Holds the authenticated identity of a connected player, including UUID, username, referral data, and referral source address. Created during the player authentication handshake.

## Constants


public static final int MAX_REFERRAL_DATA_SIZE = 4096

## Constructors


public PlayerAuthentication()


public PlayerAuthentication(@Nonnull UUID uuid, @Nonnull String username)

## Methods


@Nonnull
public String getUsername()

Returns the authenticated username. Throws `UnsupportedOperationException` if not yet set.


@Nonnull
public UUID getUuid()

Returns the authenticated UUID. Throws `UnsupportedOperationException` if not yet set.


public void setUsername(@Nonnull String username)


public void setUuid(@Nonnull UUID uuid)


@Nullable
public byte[] getReferralData()


public void setReferralData(@Nullable byte[] referralData)

Sets referral data. Throws `IllegalArgumentException` if the data exceeds 4096 bytes.


@Nullable
public HostAddress getReferralSource()


public void setReferralSource(@Nullable HostAddress referralSource)
