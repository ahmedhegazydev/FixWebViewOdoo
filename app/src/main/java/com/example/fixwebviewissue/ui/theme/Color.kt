package com.example.fixwebviewissue.ui.theme

import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)


//MTI: 31 32 30 30 -> 1200 (Authorization Request)
//Bitmap: 37 32 33 30 30 37 43 31 -> 723007C1 (Convert to binary to see which fields are present)
//Data Elements: The rest of the message contains the data elements as indicated by the bitmap.


//Detailed Parsing:
//MTI: 1200 (Authorization Request)
//Bitmap: 723007C1 (Hex) -> Convert to binary - see which fields are present.
//Binary: 0011011100110010001100110011000000110000001101110100001100110001

//This indicates that fields 2, 3, 4, 7, 11, 12, 13,
// 14, 22, 24, 25, 35, 41, 42, 48, 49, 52, 53, 55, 60,
// 61, 62, 63, 64, 66, 67, 68, 69, 70, 71, 72, 73, 74,
// 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87,
// 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100,
// 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111,
// 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
// 123, 124, 125, 126, 127, 128 are present.

//Data Elements:
//Field 2: Primary Account Number (PAN)
//Field 3: Processing Code
//Field 4: Amount, Transaction
//Field 7: Transmission Date & Time
//Field 11: System Trace Audit Number
//Field 12: Time, Local Transaction
//Field 13: Date, Local Transaction
//Field 14: Date, Expiration
//Field 22: Point of Service Entry Mode
//Field 24: Function Code
//Field 25: Message Reason Code
//Field 35: Track 2 Data
//Field 41: Card Acceptor Terminal Identification
//Field 42: Card Acceptor Identification Code
//Field 48: Additional Data - Private
//Field 49: Currency Code, Transaction
//Field 52: Personal Identification Number (PIN) Data
//Field 53: Security Related Control Information
//Field 55: Integrated Circuit Card (ICC) System Related Data
//Field 60: Reserved (Private Use)
//Field 61: Reserved (Private Use)
//Field 62: Reserved (Private Use)
//Field 63: Reserved (Private Use)
//Field 64: Message Authentication Code (MAC)
//Field 66: Settlement Code
//Field 67: Extended Payment Code
//Field 68: Receiving Institution Country Code
//Field 69: Settlement Institution Country Code
//Field 70: Network Management Information Code
//Field 71: Message Number
//Field 72: Data Record (ISO 8583:1993)
//Field 73: Date, Action
//Field 74: Credits, Number
//Field 75: Credits, Reversal Number
//Field 76: Debits, Number
//Field 77: Debits, Reversal Number
//Field 78: Transfer, Number
//Field 79: Transfer, Reversal Number
//Field 80: Inquiries, Number
//Field 81: Authorizations, Number
//Field 82: Credits, Processing Fee Amount
//Field 83: Credits, Transaction Fee Amount
//Field 84: Debits, Processing Fee Amount
//Field 85: Debits, Transaction Fee Amount
//Field 86: Credits, Amount
//Field 87: Credits, Reversal Amount
//Field 88: Debits, Amount
//Field 89: Debits, Reversal Amount
//Field 90: Original Data Elements
//Field 91: File Update Code
//Field 92: File Security Code
//Field 93: Response Indicator
//Field 94: Service Indicator
//Field 95: Replacement Amounts
//Field 96: Message Security Code
//Field 97: Amount, Net Settlement
//Field 98: Payee
//Field 99: Settlement Institution Identification Code
//Field 100: Receiving Institution Identification Code
//Field 101: File Name
//Field 102: Account Identification 1
//Field 103: Account Identification 2
//Field 104: Transaction Description
//Field 105: Reserved (ISO Use)
//Field 106: Reserved (ISO Use)
//Field 107: Reserved (ISO Use)
//Field 108: Reserved (ISO Use)
//Field 109: Reserved (ISO Use)
//Field 110: Reserved (ISO Use)
//Field 111: Reserved (ISO Use)
//Field 112: Reserved (ISO Use)
//Field 113: Reserved (ISO Use)
//Field 114: Reserved (ISO Use)
//Field 115: Reserved (ISO Use)
//Field 116: Reserved (ISO Use)
//Field 117: Reserved (ISO Use)
//Field 118: Reserved (ISO Use)
//Field 119: Reserved (ISO Use)
//Field 120: Reserved (ISO Use)
//Field 121: Reserved (ISO Use)
//Field 122: Reserved (ISO Use)
//Field 123: Reserved (ISO Use)
//Field 124: Reserved (ISO Use)
//Field 125: Reserved (ISO Use)
//Field 126: Reserved (ISO Use)
//Field 127: Reserved (ISO Use)
//Field 128: Message Authentication Code (MAC)


//Field 2: Primary Account Number (PAN)
//Format: Variable length (LLVAR or LLVAR), typically up to 19 digits.
//31 32 38 43 32 38 41 30 35 31 36 34 35 38 31 33 39 30 30 -> 128C28A051645813900

//Field 3: Processing Code
//Format: Fixed length (6 digits).
//30 30 35 30 32 35 -> 005025

//Field 4: Amount, Transaction
//Format: Fixed length (12 digits).
//33 36 38 35 30 30 30 30 30 30 30 30 -> 368500000000

//Field 7: Transmission Date & Time
//Format: Fixed length (10 digits, MMDDhhmmss).
//30 37 33 39 39 30 36 35 38 38 -> 0739906588

//Field 11: System Trace Audit Number
//Format: Fixed length (6 digits).
//30 30 31 32 30 30 -> 001200

//Field 12: Time, Local Transaction
//Fixed length (6 digits, hhmmss).
//31 39 39 30 37 33 -> 199073

//Field 13: Date, Local Transaction
//Format: Fixed length (4 digits, MMDD).
//39 39 30 36 -> 9906

//Field 14: Date, Expiration
//Format: Fixed length (4 digits, YYMM).
//35 38 38 38 -> 5888

//Field 22: Point of Service Entry Mode
//Format: Fixed length (3 digits).
//34 37 33 -> 473

//Field 24: Function Code
//Format: Fixed length (3 digits).
//37 34 35 -> 745

//Field 25: Message Reason Code
//Format: Fixed length (2 digits).
// 30 30 -> 00

//Field 35: Track 2 Data
//Format: Variable length (LLVAR or LLVAR), typically up to 37 characters.
// 32 36 30 36 32 32 31 31 30 37 33 36 30 31 38 30 30 30 30 30 31 31 32 32 33 39 30 30 30 30 34 37 32 33 30 34 31 34 32 34 30 34 31 34 32 34 30 34 38 30 30 31 35 30 34 30 30 35 36 36 -> 260622110736018000001122390000472304142404142404800150400566

//Field 41: Card Acceptor Terminal Identification
//Format: Fixed length (8 characters).
// 52 59 44 42 56 43 36 38 -> RYDBVC68

//Field 42: Card Acceptor Identification Code
//Format: Fixed length (15 characters).
// 32 31 33 23 FF FF 04 14 24 00 00 00 02 36 30 -> 213#ÿÿ$60

//Field 48: Additional Data - Private
//Format: Variable length (LLVAR or LLLVAR).
// 39 31 39 31 82 02 00 00 9F 36 02 09 85 9F 26 08 0D 17 82 44 9B 07 51 90 9F 27 01 80 9F 34 03 00 00 00 9F 1E 08 39 34 35 30 32 36 32 31 9F 10 07 06 01 12 03 A0 00 00 9F 33 03 E0 F0 C8 9F 35 01 22 95 05 00 00 00 00 00 9F 37 04 9A 17 89 F4 9F 02 06 00 00 00 00 00 01 9F 03 06 00 00 00 00 00 00 9F 1A 02 06 82 5F 2A 02 06 82 9A 03 25 01 27 9C 01 00 84 07 A0 00 00 00 03 10 10 50 0A 56 69 73 61 20 44 65 62 69 74 4F 07 A0 00 00 00 03 10 10 9F 6E 04 20 70 00 00 -> 91916&DQ'494502621 3àðÈ5"7ô_*%' PVisa DebitO n p

//Field 49: Currency Code, Transaction
//Format: Fixed length (3 digits).
// 34 37 32 -> 472
//
//Field 52: Personal Identification Number (PIN) Data
//Format: Fixed length (8 bytes, binary).
// 31 31 36 30 31 31 30 32 -> 11601102
//
//Field 53: Security Related Control Information
//Format: Fixed length (16 bytes, binary).
// 30 30 33 30 30 33 35 33 30 30 34 30 30 35 30 30 -> 0030035300400500

//Field 55: Integrated Circuit Card (ICC) System Related Data
//Format: Variable length (LLVAR or LLLVAR).
// 37 4E 32 34 34 31 33 38 45 30 34 36 34 33 34 33 30 39 30 31 30 30 30 30 30 30 30 30 30 30 31 31 30 30 30 30 30 30 30 30 30 31 32 30 30 30 30 30 30 30 30 30 31 33 30 30 30 30 30 30 30 30 30 31 34 30 30 30 30 30 30 30 30 30 30 30 30 31 35 30 36 30 30 30 39 31 36 30 31 30 32 30 32 30 32 0C 3F 58 -> 7N244138E04643430901000000000011000000001200000000130000000140000000000150060091601020202?X
//






// Parse the MTI
//The first 4 bytes represent the Message Type Indicator (MTI):
//Hex: 31 32 31 30
//ASCII: 1210
//MTI: 1210 (Authorization Response)

// Parse the Bitmap
//The next 8 bytes represent the Primary Bitmap:
//Hex: 37 32 33 30 30 30 31 31
//ASCII: 72300011
//Binary: 0011011100110010001100110011000000110000001100000011000100110001
//This bitmap indicates which fields are present in the message. Based on the binary representation, the following fields are present:

//Fields 2, 3, 4, 7, 11, 12, 13, 14, 22, 24, 25, 35, 39, 41, 42, 48, 49, 52, 53, 55, etc.

// Extract the Specified Fields
//We’ll now extract the values for the requested fields:

//Field 2: Primary Account Number (PAN)
//Format: Variable length (LLVAR or LLVAR), typically up to 19 digits.
// 30 45 43 32 38 41 30 31 31 36 34 35 38 31 33 39 30 30 -> 0EC28A011645813900

//Field 3: Processing Code
//Format: Fixed length (6 digits).
// 35 30 32 35 33 36 -> 502536

//Field 4: Amount, Transaction
//Format: Fixed length (12 digits).
// 38 35 30 30 30 30 30 30 30 30 30 30 -> 850000000000

//Field 7: Transmission Date & Time
//Format: Fixed length (10 digits, MMDDhhmmss).
// 30 30 30 31 31 30 45 43 32 38 -> 000110EC28

//Field 11: System Trace Audit Number
//Format: Fixed length (6 digits).
// 41 30 31 31 36 34 -> A01164

//Field 12: Time, Local Transaction
//Format: Fixed length (6 digits, hhmmss).
// 35 38 31 33 39 30 -> 581390

//Field 13: Date, Local Transaction
//Format: Fixed length (4 digits, MMDD).
// 30 35 30 32 -> 0502

//Field 14: Date, Expiration
//Format: Fixed length (4 digits, YYMM).
// 35 33 36 38 -> 5368
//
//Field 22: Point of Service Entry Mode
//Format: Fixed length (3 digits).
// 35 30 30 -> 500
//
//Field 24: Function Code
//Format: Fixed length (3 digits).
// 31 30 31 -> 101
//
//Field 25: Message Reason Code
//Format: Fixed length (2 digits).
// 32 37 -> 27
//
//Field 35: Track 2 Data
//Format: Variable length (LLVAR or LLVAR), typically up to 37 characters.
// 30 38 32 32 33 39 30 30 30 30 34 37 32 35 30 31 32 37 31 31 32 32 33 39
// 32 35 30 31 32 35 30 36 35 38 38 38 34 37 31 31 32 32 33 39 30 30 30 30
// 34 37 30 39 37 36 37 36 30 30 30 32 33 30 34 31 34 32 34 30 34 31 34 32
// 34 30 34 38 30 30 31 35 30 34 30 30 35 36 36 ->
// 082239000047250127112239250125065888471122390000470976760002304142404142404800150400566

//Field 39: Response Code
//Format: Fixed length (2 digits).
// 30 30 -> 00

//Field 41: Card Acceptor Terminal Identification
//Format: Fixed length (8 characters).
// 52 59 44 42 56 43 36 38 -> RYDBVC68

//Field 42: Card Acceptor Identification Code
//Format: Fixed length (15 characters).
// 32 31 33 23 FF FF 04 14 24 00 00 00 02 36 30 -> 213#ÿÿ$60

//Field 48: Additional Data - Private
//Format: Variable length (LLVAR or LLLVAR).
// 39 30 30 34 8A 02 30 35 58 91 5F -> 900405X_
//
//Field 49: Currency Code, Transaction
//Format: Fixed length (3 digits).
// 36 30 39 -> 609

//Field 52: Personal Identification Number (PIN) Data
//Format: Fixed length (8 bytes, binary).
// 30 30 30 32 33 30 34 31 -> 00023041

//Field 53: Security Related Control Information
//Format: Fixed length (16 bytes, binary).
// 34 32 34 30 34 31 34 32 34 30 34 38 30 30 31 35 -> 4240414240480015

//Field 55: Integrated Circuit Card (ICC) System Related Data
//Format: Variable length (LLVAR or LLLVAR).
// 30 34 30 30 35 36 36 20 20 20 30 30 36 -> 0400566 006