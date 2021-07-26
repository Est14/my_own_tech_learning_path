package main

import "fmt"

// SMS Email
type INotificationFactory interface {
	SendNotification()
	GetSender() ISender
}

type ISender interface {
	GetSenderMethod() string
	GetSenderChanel() string
}

type SMSNotification struct {
}

func (SMSNotification) SendNotification() {
	fmt.Println("SMS")
}

func (SMSNotification) GetSender() ISender {
	return SMSNotificationSender{}
}

type SMSNotificationSender struct {
}

func (SMSNotificationSender) GetSenderMethod() string {
	return "Getting MSM"
}

func (SMSNotificationSender) GetSenderChanel() string {
	return "Sender Channel"
}

type EmailNotification struct{}

func (EmailNotification) SendNotification() {
	fmt.Println("Email")
}

func (EmailNotification) GetSender() ISender {

	return EmailNotificationSender{}
}

type EmailNotificationSender struct{}

func (EmailNotificationSender) GetSenderMethod() string {

	return "Getting Email"
}

func (EmailNotificationSender) GetSenderChanel() string {

	return "Getting Email Channel"
}

func getNotificationFactory(notificationType string) (INotificationFactory, error) {

	if notificationType == "SMS" {
		return &SMSNotification{}, nil
	}
	if notificationType == "Email" {
		return &EmailNotification{}, nil
	}

	return nil, fmt.Errorf("Not notificatin type")
}

func sendNotification(f INotificationFactory) {
	f.SendNotification()
}

func getMethod(f INotificationFactory) {
	fmt.Println(f.GetSender().GetSenderMethod())
}

func main() {

	smsFactory, _ := getNotificationFactory("SMS")
	emailFactory, _ := getNotificationFactory("Email")

	sendNotification(smsFactory)
	sendNotification(emailFactory)

	getMethod(smsFactory)
	getMethod(emailFactory)
}
