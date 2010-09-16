/**
 * Copyright 2010 TèksMe, Inc.
 * TèksMe licenses this file to you under the Apache License, version 
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 */
package org.teksme.model.teks.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.teksme.model.teks.Annotation;
import org.teksme.model.teks.Comment;
import org.teksme.model.teks.Poll;
import org.teksme.model.teks.PollQuestion;
import org.teksme.model.teks.PollSettings;
import org.teksme.model.teks.ReplyMessage;
import org.teksme.model.teks.TeksPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poll</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getQuestionList <em>Question</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getReplyMessage <em>Reply Message</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getAnnotationsList <em>Annotations</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getCommentsList <em>Comments</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getNote <em>Note</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link org.teksme.model.teks.impl.PollImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PollImpl extends EObjectImpl implements Poll {
	/**
	 * The cached value of the '{@link #getQuestionList() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionList()
	 * @generated
	 * @ordered
	 */
	protected EList<PollQuestion> question;

	/**
	 * The empty value for the '{@link #getQuestion() <em>Question</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected static final PollQuestion[] QUESTION_EEMPTY_ARRAY = new PollQuestion[0];

	/**
	 * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSettings()
	 * @generated
	 * @ordered
	 */
	protected PollSettings settings;

	/**
	 * The cached value of the '{@link #getReplyMessage() <em>Reply Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReplyMessage()
	 * @generated
	 * @ordered
	 */
	protected ReplyMessage replyMessage;

	/**
	 * The cached value of the '{@link #getAnnotationsList() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotationsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The empty value for the '{@link #getAnnotations() <em>Annotations</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected static final Annotation[] ANNOTATIONS_EEMPTY_ARRAY = new Annotation[0];

	/**
	 * The cached value of the '{@link #getCommentsList() <em>Comments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommentsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> comments;

	/**
	 * The empty value for the '{@link #getComments() <em>Comments</em>}' array accessor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments()
	 * @generated
	 * @ordered
	 */
	protected static final Comment[] COMMENTS_EEMPTY_ARRAY = new Comment[0];

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected static final String NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected String note = NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected String author = AUTHOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected Date lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PollImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TeksPackage.Literals.POLL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollQuestion[] getQuestion() {
		if (question == null || question.isEmpty())
			return QUESTION_EEMPTY_ARRAY;
		BasicEList<PollQuestion> list = (BasicEList<PollQuestion>) question;
		list.shrink();
		return (PollQuestion[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollQuestion getQuestion(int index) {
		return getQuestionList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuestionLength() {
		return question == null ? 0 : question.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(PollQuestion[] newQuestion) {
		((BasicEList<PollQuestion>) getQuestionList()).setData(
				newQuestion.length, newQuestion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuestion(int index, PollQuestion element) {
		getQuestionList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PollQuestion> getQuestionList() {
		if (question == null) {
			question = new EObjectContainmentWithInverseEList.Resolving<PollQuestion>(
					PollQuestion.class, this, TeksPackage.POLL__QUESTION,
					TeksPackage.POLL_QUESTION__POLL_REF);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSettings getSettings() {
		if (settings != null && settings.eIsProxy()) {
			InternalEObject oldSettings = (InternalEObject) settings;
			settings = (PollSettings) eResolveProxy(oldSettings);
			if (settings != oldSettings) {
				InternalEObject newSettings = (InternalEObject) settings;
				NotificationChain msgs = oldSettings.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.POLL__SETTINGS,
						null, null);
				if (newSettings.eInternalContainer() == null) {
					msgs = newSettings.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
							- TeksPackage.POLL__SETTINGS, null, msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.POLL__SETTINGS, oldSettings, settings));
			}
		}
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PollSettings basicGetSettings() {
		return settings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSettings(PollSettings newSettings,
			NotificationChain msgs) {
		PollSettings oldSettings = settings;
		settings = newSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.POLL__SETTINGS, oldSettings,
					newSettings);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSettings(PollSettings newSettings) {
		if (newSettings != settings) {
			NotificationChain msgs = null;
			if (settings != null)
				msgs = ((InternalEObject) settings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.POLL__SETTINGS,
						null, msgs);
			if (newSettings != null)
				msgs = ((InternalEObject) newSettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - TeksPackage.POLL__SETTINGS,
						null, msgs);
			msgs = basicSetSettings(newSettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__SETTINGS, newSettings, newSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage getReplyMessage() {
		if (replyMessage != null && replyMessage.eIsProxy()) {
			InternalEObject oldReplyMessage = (InternalEObject) replyMessage;
			replyMessage = (ReplyMessage) eResolveProxy(oldReplyMessage);
			if (replyMessage != oldReplyMessage) {
				InternalEObject newReplyMessage = (InternalEObject) replyMessage;
				NotificationChain msgs = oldReplyMessage.eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL__REPLY_MESSAGE, null, null);
				if (newReplyMessage.eInternalContainer() == null) {
					msgs = newReplyMessage.eInverseAdd(this,
							EOPPOSITE_FEATURE_BASE
									- TeksPackage.POLL__REPLY_MESSAGE, null,
							msgs);
				}
				if (msgs != null)
					msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							TeksPackage.POLL__REPLY_MESSAGE, oldReplyMessage,
							replyMessage));
			}
		}
		return replyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyMessage basicGetReplyMessage() {
		return replyMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReplyMessage(ReplyMessage newReplyMessage,
			NotificationChain msgs) {
		ReplyMessage oldReplyMessage = replyMessage;
		replyMessage = newReplyMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, TeksPackage.POLL__REPLY_MESSAGE,
					oldReplyMessage, newReplyMessage);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplyMessage(ReplyMessage newReplyMessage) {
		if (newReplyMessage != replyMessage) {
			NotificationChain msgs = null;
			if (replyMessage != null)
				msgs = ((InternalEObject) replyMessage).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL__REPLY_MESSAGE, null, msgs);
			if (newReplyMessage != null)
				msgs = ((InternalEObject) newReplyMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- TeksPackage.POLL__REPLY_MESSAGE, null, msgs);
			msgs = basicSetReplyMessage(newReplyMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__REPLY_MESSAGE, newReplyMessage,
					newReplyMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation[] getAnnotations() {
		if (annotations == null || annotations.isEmpty())
			return ANNOTATIONS_EEMPTY_ARRAY;
		BasicEList<Annotation> list = (BasicEList<Annotation>) annotations;
		list.shrink();
		return (Annotation[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotations(int index) {
		return getAnnotationsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAnnotationsLength() {
		return annotations == null ? 0 : annotations.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(Annotation[] newAnnotations) {
		((BasicEList<Annotation>) getAnnotationsList()).setData(
				newAnnotations.length, newAnnotations);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotations(int index, Annotation element) {
		getAnnotationsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotationsList() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList.Resolving<Annotation>(
					Annotation.class, this, TeksPackage.POLL__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment[] getComments() {
		if (comments == null || comments.isEmpty())
			return COMMENTS_EEMPTY_ARRAY;
		BasicEList<Comment> list = (BasicEList<Comment>) comments;
		list.shrink();
		return (Comment[]) list.data();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComments(int index) {
		return getCommentsList().get(index);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCommentsLength() {
		return comments == null ? 0 : comments.size();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(Comment[] newComments) {
		((BasicEList<Comment>) getCommentsList()).setData(newComments.length,
				newComments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComments(int index, Comment element) {
		getCommentsList().set(index, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getCommentsList() {
		if (comments == null) {
			comments = new EObjectContainmentEList.Resolving<Comment>(
					Comment.class, this, TeksPackage.POLL__COMMENTS);
		}
		return comments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNote() {
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNote(String newNote) {
		String oldNote = note;
		note = newNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__NOTE, oldNote, note));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		String oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__AUTHOR, oldAuthor, author));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastModified(Date newLastModified) {
		Date oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__LAST_MODIFIED, oldLastModified,
					lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					TeksPackage.POLL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.POLL__QUESTION:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getQuestionList())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TeksPackage.POLL__QUESTION:
			return ((InternalEList<?>) getQuestionList()).basicRemove(otherEnd,
					msgs);
		case TeksPackage.POLL__SETTINGS:
			return basicSetSettings(null, msgs);
		case TeksPackage.POLL__REPLY_MESSAGE:
			return basicSetReplyMessage(null, msgs);
		case TeksPackage.POLL__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotationsList()).basicRemove(
					otherEnd, msgs);
		case TeksPackage.POLL__COMMENTS:
			return ((InternalEList<?>) getCommentsList()).basicRemove(otherEnd,
					msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TeksPackage.POLL__QUESTION:
			return getQuestionList();
		case TeksPackage.POLL__SETTINGS:
			if (resolve)
				return getSettings();
			return basicGetSettings();
		case TeksPackage.POLL__REPLY_MESSAGE:
			if (resolve)
				return getReplyMessage();
			return basicGetReplyMessage();
		case TeksPackage.POLL__ANNOTATIONS:
			return getAnnotationsList();
		case TeksPackage.POLL__COMMENTS:
			return getCommentsList();
		case TeksPackage.POLL__TITLE:
			return getTitle();
		case TeksPackage.POLL__NOTE:
			return getNote();
		case TeksPackage.POLL__AUTHOR:
			return getAuthor();
		case TeksPackage.POLL__LAST_MODIFIED:
			return getLastModified();
		case TeksPackage.POLL__ID:
			return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TeksPackage.POLL__QUESTION:
			getQuestionList().clear();
			getQuestionList().addAll(
					(Collection<? extends PollQuestion>) newValue);
			return;
		case TeksPackage.POLL__SETTINGS:
			setSettings((PollSettings) newValue);
			return;
		case TeksPackage.POLL__REPLY_MESSAGE:
			setReplyMessage((ReplyMessage) newValue);
			return;
		case TeksPackage.POLL__ANNOTATIONS:
			getAnnotationsList().clear();
			getAnnotationsList().addAll(
					(Collection<? extends Annotation>) newValue);
			return;
		case TeksPackage.POLL__COMMENTS:
			getCommentsList().clear();
			getCommentsList().addAll((Collection<? extends Comment>) newValue);
			return;
		case TeksPackage.POLL__TITLE:
			setTitle((String) newValue);
			return;
		case TeksPackage.POLL__NOTE:
			setNote((String) newValue);
			return;
		case TeksPackage.POLL__AUTHOR:
			setAuthor((String) newValue);
			return;
		case TeksPackage.POLL__LAST_MODIFIED:
			setLastModified((Date) newValue);
			return;
		case TeksPackage.POLL__ID:
			setId((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TeksPackage.POLL__QUESTION:
			getQuestionList().clear();
			return;
		case TeksPackage.POLL__SETTINGS:
			setSettings((PollSettings) null);
			return;
		case TeksPackage.POLL__REPLY_MESSAGE:
			setReplyMessage((ReplyMessage) null);
			return;
		case TeksPackage.POLL__ANNOTATIONS:
			getAnnotationsList().clear();
			return;
		case TeksPackage.POLL__COMMENTS:
			getCommentsList().clear();
			return;
		case TeksPackage.POLL__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		case TeksPackage.POLL__NOTE:
			setNote(NOTE_EDEFAULT);
			return;
		case TeksPackage.POLL__AUTHOR:
			setAuthor(AUTHOR_EDEFAULT);
			return;
		case TeksPackage.POLL__LAST_MODIFIED:
			setLastModified(LAST_MODIFIED_EDEFAULT);
			return;
		case TeksPackage.POLL__ID:
			setId(ID_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TeksPackage.POLL__QUESTION:
			return question != null && !question.isEmpty();
		case TeksPackage.POLL__SETTINGS:
			return settings != null;
		case TeksPackage.POLL__REPLY_MESSAGE:
			return replyMessage != null;
		case TeksPackage.POLL__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case TeksPackage.POLL__COMMENTS:
			return comments != null && !comments.isEmpty();
		case TeksPackage.POLL__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT
					.equals(title);
		case TeksPackage.POLL__NOTE:
			return NOTE_EDEFAULT == null ? note != null : !NOTE_EDEFAULT
					.equals(note);
		case TeksPackage.POLL__AUTHOR:
			return AUTHOR_EDEFAULT == null ? author != null : !AUTHOR_EDEFAULT
					.equals(author);
		case TeksPackage.POLL__LAST_MODIFIED:
			return LAST_MODIFIED_EDEFAULT == null ? lastModified != null
					: !LAST_MODIFIED_EDEFAULT.equals(lastModified);
		case TeksPackage.POLL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", note: ");
		result.append(note);
		result.append(", author: ");
		result.append(author);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PollImpl
