-----------------------------------------------------------------------------
-- DISCUSSION_CHANNEL
-----------------------------------------------------------------------------

CREATE TABLE DISCUSSION_CHANNEL
(
    CHANNEL_ID VARCHAR2 (99) NOT NULL,
	NEXT_ID INT,
    XML LONG
);

ALTER TABLE DISCUSSION_CHANNEL
       ADD  ( PRIMARY KEY (CHANNEL_ID) ) ;

-----------------------------------------------------------------------------
-- DISCUSSION_MESSAGE
-- Note that this design does not enforce referential integrity
-- between channels and messages.  Upon deletion of a DISCUSSION_CHANNEL,
-- the foreign key constraints will merely set the discussion_message keys 
-- to NULL, rather than delete the DISCUSSION_MESSAGE record.  This will
-- leave orphans.  Additionally, the REPLY constraint is a fishhook 
-- relationship back to DISCUSSION_MESSAGE, which will also set the REPLY
-- field to NULL on deletion of a record.  This could leave orphaned 
-- messages that do not contain references back to their parent, which 
-- may or may not be acceptable, depending upon the design of the 
-- application.
-----------------------------------------------------------------------------

CREATE TABLE DISCUSSION_MESSAGE (
       MESSAGE_ID           VARCHAR2(36 BYTE) NOT NULL,
       CHANNEL_ID           VARCHAR2(99 BYTE) NULL,
       DRAFT                CHAR(1) NULL
                                   CHECK (DRAFT IN (1, 0)),
       PUBVIEW              CHAR(1) NULL
                                   CHECK (PUBVIEW IN (1, 0)),
       OWNER                VARCHAR2(99) NULL,
       CATEGORY             VARCHAR2(255) NULL,
       REPLY                VARCHAR2(36 BYTE) NULL,
       MESSAGE_DATE         DATE NOT NULL,
       XML                  LONG NULL
);

ALTER TABLE DISCUSSION_MESSAGE
       ADD  ( PRIMARY KEY (MESSAGE_ID) ) ;

ALTER TABLE DISCUSSION_MESSAGE
       ADD  ( FOREIGN KEY (REPLY)
                             REFERENCES DISCUSSION_MESSAGE
                             ON DELETE SET NULL ) ;

ALTER TABLE DISCUSSION_MESSAGE
       ADD  ( FOREIGN KEY (CHANNEL_ID)
                             REFERENCES DISCUSSION_CHANNEL
                             ON DELETE SET NULL ) ;

CREATE INDEX FK_DISC_MSG_CHANNEL ON DISCUSSION_MESSAGE
(
       CHANNEL_ID                     ASC
);

CREATE INDEX IE_DISC_MSG_ATTRIB ON DISCUSSION_MESSAGE
(
       DRAFT                          ASC,
       PUBVIEW                        ASC,
       OWNER                          ASC
);

CREATE INDEX IE_DISC_MSG_DATE ON DISCUSSION_MESSAGE
(
       MESSAGE_DATE                   ASC
);

CREATE INDEX IE_DISC_MSG_DATE_DESC ON DISCUSSION_MESSAGE
(
       MESSAGE_DATE                   DESC
);

CREATE INDEX IE_DISC_MSG_CATEGORY ON DISCUSSION_MESSAGE
(
       CATEGORY                       ASC
);

CREATE INDEX IE_DISC_MSG_REPLY ON DISCUSSION_MESSAGE
(
       REPLY                          ASC
);

CREATE INDEX DISC_MSG_CDD ON DISCUSSION_MESSAGE
(
	CHANNEL_ID,
	MESSAGE_DATE,
	DRAFT
);
